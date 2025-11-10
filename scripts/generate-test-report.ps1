# Generate a simple HTML test report from Surefire XML reports
$reportDir = "target/surefire-reports"
$xmlFiles = Get-ChildItem -Path $reportDir -Filter 'TEST-*.xml' -ErrorAction SilentlyContinue
if (-not $xmlFiles) {
    Write-Host "No TEST-*.xml files found in $reportDir"
    exit 1
}

$tests = @()
$totals = @{tests=0; failures=0; errors=0; skipped=0; time=0}
$seenTests = @{}

# Define solo los tests que existen en src/test/java/com/tutortics
$allowedClasses = @(
    'com.tutortics.ejemplo_1_13_test',
    'com.tutortics.ejemplo_2_5_test',
    'com.tutortics.ejemplo_4_3_test',
    'com.tutortics.problema_2_9_test',
    'com.tutortics.problema_3_6_test',
    'com.tutortics.problema_4_7_test',
    'com.tutortics.problema_4_22_test',
    'com.tutortics.problema_ps_1_6_test',
    'com.tutortics.problema_ps_3_1_al_3_5_test',
    'com.tutortics.problema_ps_3_39_test',
    'com.tutortics.problema_ps_4_11_test',
    'com.tutortics.problema_ps_4_27_test',
    'com.tutortics.problema_ps_5_6_test'
)

foreach ($file in $xmlFiles) {
    try {
        [xml]$doc = Get-Content $file.FullName
    } catch {
        Write-Warning "Could not read $($file.FullName): $_"
        continue
    }
    
    $suite = $doc.testsuite
    if ($suite) {
        foreach ($case in $suite.testcase) {
            # Solo procesar tests de las clases permitidas y evitar duplicados
            $testKey = "$($case.classname)_$($case.name)"
            Write-Host "Checking test: $($case.classname) - $($case.name)"
            if ($allowedClasses -contains $case.classname -and -not $seenTests.ContainsKey($testKey)) {
                $status = 'passed'
                if ($case.failure) { $status = 'failed' }
                elseif ($case.error) { $status = 'error' }
                elseif ($case.skipped) { $status = 'skipped' }
                
                $tests += [pscustomobject]@{
                    classname=$case.classname
                    name=$case.name
                    time=$case.time
                    status=$status
                }
                
                $seenTests[$testKey] = $true
                
                # Solo contar tests únicos en los totales
                $totals.tests++
                if ($status -eq 'failed') { $totals.failures++ }
                elseif ($status -eq 'error') { $totals.errors++ }
                elseif ($status -eq 'skipped') { $totals.skipped++ }
                $totals.time += [double]($case.time)
            }
        }
    }
}

$passedCount = $totals.tests - $totals.failures - $totals.errors - $totals.skipped
$overallStatus = if ($totals.failures -gt 0 -or $totals.errors -gt 0) { 'FAIL' } else { 'PASS' }

# Build HTML
$htmlHeader = @"
<!doctype html>
<html>
<head>
<meta charset='utf-8'>
<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<title>Reporte de Pruebas</title>
<link rel='stylesheet' href='styles/style.css'>
</head>
<body>
<div class="container">
    <header>
        <h1>Reporte de Pruebas</h1>
        <p>Estado General: $overallStatus</p>
    </header>
    
    <div class="summary-card">
        <h2>Resumen</h2>
        <div class="stats-grid">
            <div class="stat-item">
                <span class="label">Total</span>
                <span class="value total">$($totals.tests)</span>
            </div>
            <div class="stat-item">
                <span class="label">Aprobados</span>
                <span class="value passed">$passedCount</span>
            </div>
            <div class="stat-item">
                <span class="label">Fallidos</span>
                <span class="value failed">$($totals.failures)</span>
            </div>
        </div>
        <div class="footer">
            Tiempo total: $([math]::Round($totals.time,3)) segundos
            • Errores: $($totals.errors)
            • Omitidos: $($totals.skipped)
        </div>
    </div>
    <div class="exercises-list">
        <h2>Resultados de las Pruebas</h2>
        <style>
            .exercise-group {
                margin-bottom: 2rem;
                background: var(--color-card-bg);
                border-radius: 8px;
                overflow: hidden;
            }
            .exercise-header {
                background: var(--color-bg);
                padding: 1rem;
                border-bottom: 1px solid var(--color-border);
            }
            .exercise-header h3 {
                margin: 0;
                color: var(--color-primary-text);
            }
            .exercise-header small {
                color: var(--color-secondary-text);
            }
            .test-cases {
                padding: 1rem;
            }
            .test-cases .exercise-details:last-child {
                border-bottom: none;
            }
        </style>
"@

# Agrupar tests por ejercicio
$groupedTests = $tests | Group-Object -Property classname

$htmlBody = ""
foreach ($group in $groupedTests) {
    $className = $group.Name -replace '[<>]',''
    # Extraer el nombre del ejercicio del nombre de la clase
    $exerciseName = $className -replace 'com\.tutortics\.','' -replace '_test$',''
    
    # Intentar obtener la fecha de última modificación del archivo de test correspondiente
    $classFile = ($className -replace 'com\.tutortics\.', '') + '.java'
    $testFilePath = Join-Path -Path 'src/test/java/com/tutortics' -ChildPath $classFile
    if (Test-Path $testFilePath) {
        $lastMod = (Get-Item $testFilePath).LastWriteTime.ToString('yyyy-MM-dd HH:mm')
    } else {
        $lastMod = 'N/D'
    }

    $htmlBody += @"
    <div class='exercise-group'>
        <div class='exercise-header'>
            <h3>$exerciseName</h3>
            <small>Total de pruebas: $($group.Count) • Última modificación: $lastMod</small>
        </div>
        <div class='test-cases'>
"@
    
    foreach ($t in $group.Group) {
        $nm = $t.name -replace '[<>]',''
        $st = $t.status
        $tm = $t.time
        $statusClass = if ($st -eq 'passed') { 'status-pasado' } else { 'status-fallado' }
        $htmlBody += "<div class='exercise-details'><div class='test-case-item $statusClass'>$nm<br><small>$tm s</small></div></div>`n"
    }
    
    $htmlBody += "</div></div>`n"
}

$htmlFooter = @"
    </div>
</div>
</body>
</html>
"@

$full = $htmlHeader + $htmlBody + $htmlFooter
Set-Content -Path "index.html" -Value $full -Encoding UTF8
Write-Host "Generated index.html with $($tests.Count) test rows."