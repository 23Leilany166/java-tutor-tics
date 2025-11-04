# Ejemplo 1.9 — Cuadrado y Cubo (Java 21, Programación Estructurada)

Este ejercicio implementa un programa **secuencial** que:
1) **Lee** un entero positivo `NUM`.
2) **Calcula** su **cuadrado** (`CUA`) y **cubo** (`CUB`).
3) **Imprime** ambos resultados.

Incluye:
- Código fuente: `src/edu/primersemestre/CalculadoraPrincipiante.java`
- Pruebas JUnit 5: `test/edu/primersemestre/CalculadoraPrincipianteTest.java`
- Diagrama de flujo: `diagramas/Ejemplo1_9.log` y `diagramas/Ejemplo1_9.png` (fondo transparente)

## Estructura de carpetas
```
Ejemplo1.9/
 ├─ src/
 │  └─ edu/primersemestre/CalculadoraPrincipiante.java
 ├─ test/
 │  └─ edu/primersemestre/CalculadoraPrincipianteTest.java
 ├─ diagramas/
 │  ├─ Ejemplo1_9.log
 │  └─ Ejemplo1_9.png
 └─ README.md
```

## Requisitos
- **Java 21** instalado (`java -version` y `javac -version`).
- Recomendado: **Visual Studio Code** con extensiones:
  - *Extension Pack for Java*
  - *Test Runner for Java*

---

## Opción A: Ejecutar en VS Code (recomendado para principiantes)

1. Abre la carpeta `Ejemplo1.9/` en VS Code.
2. Abre `CalculadoraPrincipiante.java` y presiona **Run ▶** para ejecutar.
3. Para correr los tests, abre `CalculadoraPrincipianteTest.java` y pulsa **Run Test** (ícono ▶ sobre la clase o cada prueba).

> VS Code detecta automáticamente el *classpath* y ejecuta JUnit 5 mediante el Test Runner, incluso sin Maven.

---

## Opción B: Compilar y ejecutar por terminal (sin Maven)

Desde la carpeta `Ejemplo1.9/`:

```bash
# Compilar
javac -d out $(find src -name "*.java")

# Ejecutar
java -cp out edu.primersemestre.CalculadoraPrincipiante
```

> Para ejecutar pruebas **sin** Maven necesitarías añadir los `.jar` de JUnit 5 manualmente al classpath. Para estudiantes, recomendamos VS Code (Opción A) o Maven (Opción C).

---

## Opción C: Usar Maven (para proyectos más grandes)

1. Crea un `pom.xml` en la raíz y agrega la dependencia de JUnit 5:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>edu.primersemestre</groupId>
  <artifactId>ejemplo19</artifactId>
  <version>1.0.0</version>
  <properties>
    <maven.compiler.source>21</maven.compiler.source>
    <maven.compiler.target>21</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <junit.jupiter.version>5.10.2</junit.jupiter.version>
  </properties>
  <dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>${junit.jupiter.version}</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.2.5</version>
      </plugin>
    </plugins>
  </build>
</project>
```

2. Mueve los archivos a la estructura estándar (opcional):
```
src/main/java/edu/primersemestre/CalculadoraPrincipiante.java
src/test/java/edu/primersemestre/CalculadoraPrincipianteTest.java
```

3. Ejecuta:
```bash
mvn -q test        # correr pruebas
mvn -q -DskipTests package
mvn -q exec:java   # si configuras el plugin exec
```

---

## Uso del programa
Ejemplo de entrada/salida:
```
Introduce un número entero positivo (NUM): 7
El cuadrado (CUA) es: 49
El cubo (CUB) es: 343
```

---

## Diagrama de flujo
- Texto (.log): `diagramas/Ejemplo1_9.log`
- Imagen PNG (transparente): `diagramas/Ejemplo1_9.png`

La simbología es la clásica: **Terminal** (Inicio/Fin), **Entrada** (paralelogramo), **Proceso** (rectángulo) y **Salida** (paralelogramo).

¡Éxitos! 💪 Cualquier duda, corre los tests y revisa los comentarios en el código.
