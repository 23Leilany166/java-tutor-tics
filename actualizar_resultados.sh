#!/bin/bash
echo "🧪 Ejecutando tests..."

# Inicializa el estado
STATUS="ok"
rm -rf bin/*
javac -d bin -cp "lib/*" src/*.java tests/*.java

# Crear arreglo para guardar resultados individuales
DETAILS=()
FAILED=0
PASSED=0

# Ejecutar cada test de la carpeta
for TESTFILE in tests/*.java; do
  TESTNAME=$(basename "$TESTFILE" .java)
  echo "▶️ Ejecutando $TESTNAME ..."
  OUTPUT=$(java -cp "lib/*;bin" org.junit.runner.JUnitCore "$TESTNAME" 2>&1)
  if echo "$OUTPUT" | grep -q "FAILURES!!!"; then
    DETAILS+=("{\"name\": \"$TESTNAME\", \"result\": \"fail\"}")
    FAILED=$((FAILED+1))
    STATUS="fail"
  else
    DETAILS+=("{\"name\": \"$TESTNAME\", \"result\": \"success\"}")
    PASSED=$((PASSED+1))
  fi
done

# Unir detalles como JSON válido
DETAILS_JSON=$(printf ",%s" "${DETAILS[@]}")
DETAILS_JSON="[${DETAILS_JSON:1}]"

# Guardar el timestamp
TIMESTAMP=$(date '+%d/%m/%Y, %I:%M:%S %p')

# Crear archivo JSON
cat <<EOF > test_status.json
{
  "status": "$STATUS",
  "timestamp": "$TIMESTAMP",
  "passed": $PASSED,
  "failed": $FAILED,
  "details": $DETAILS_JSON
}
EOF

echo "✅ Archivo test_status.json actualizado correctamente."
