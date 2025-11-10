## Purpose
Quick, actionable guidance for AI coding agents to be productive in this repository.

## Big picture
- This is a small educational Java repository containing exercise solutions in `src/`, unit tests in `tests/`, static pages in `pages/`, and assets in `assets/`.
- Tests are run using JUnit 4.13.2 with the jars stored (or downloaded) into `lib/`. The CI workflow `.github/workflows/test-xavier.yml` shows the canonical test steps.

## How to build & run tests (exact, reproducible)
- CI (reference): `.github/workflows/test-xavier.yml` — runs on Ubuntu, installs Java 17, downloads JUnit jars into `lib/`, compiles `src/*.java` and `tests/*.java`, and runs `org.junit.runner.JUnitCore`.
- Local (Linux/macOS):
  - Download jars (if `lib/` is empty):
    curl -L -o lib/junit-4.13.2.jar https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
    curl -L -o lib/hamcrest-core-1.3.jar https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
  - Compile and run (POSIX):
    javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar src/*.java tests/*.java
    java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestSumar
  - Notes: CI compiles/runs a specific test class (`TestSumar`) — replace with any other `Test...` class to run it locally.

- Local (Windows PowerShell):
  - Download jars (PowerShell):
    Invoke-WebRequest -Uri https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar -OutFile lib\junit-4.13.2.jar
    Invoke-WebRequest -Uri https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar -OutFile lib\hamcrest-core-1.3.jar
  - Compile and run (PowerShell / Windows):
    javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" src\*.java tests\*.java
    java -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestSumar

## Project-specific conventions
- No Java packages are used — source files live in the default package (`src/*.java`). When editing or creating classes, keep them in separate files with the same public class name (e.g., `Sumar.java` -> `public class Sumar`).
- Tests are JUnit 4 style and live in `tests/`. Test class names map to tested classes (`TestSumar` -> tests `Sumar`).
- `lib/` is expected to contain third-party jars used during compilation; CI downloads them on demand.
- HTML pages in `pages/` and `assets/` are static; they document problem statements and expected outputs. Use `pages/` to find examples of expected output formatting.

## Patterns & examples agents should follow
- When adding or editing a solution in `src/`, run the corresponding test in `tests/` to confirm behavior. Example: change `src/Sumar.java` -> run `tests/TestSumar.java`.
- Keep changes minimal and localized: these exercises are small, single-class solutions. Avoid adding packages or complex build systems unless explicitly requested.
- CI runs only a single test class by default; to run the full test suite locally, invoke JUnitCore with multiple test class names or write a short shell/batch to iterate through `tests/*.java` (the repository does not include a test runner script).

## Integration & automation
- CI file: `.github/workflows/test-xavier.yml` — useful to mirror behavior locally (Java 17, download jars, compile, run tests).
- `actualizar_resultados.sh` exists — likely updates generated HTML pages or results; inspect before running on Windows (it's a shell script).

## Quick references (files to open)
- `src/` — solution implementations (e.g., `Sumar.java`, `Problema1_3.java`).
- `tests/` — JUnit tests (e.g., `TestSumar.java`).
- `lib/` — third-party jars used during compilation (CI downloads JUnit/hamcrest into here).
- `.github/workflows/test-xavier.yml` — canonical CI steps and commands.
- `pages/` & `assets/` — static HTML/CSS used for exercise descriptions and diagrams.

## When unsure, do this
1. Run the CI steps locally (download jars into `lib/`, compile `src/` + `tests/`).
2. Run the specific `Test...` class that relates to your change.
3. Inspect `pages/` if test failures mention expected output formatting.

---
If any of these instructions are unclear or you'd like extra examples (e.g., a small PowerShell script that runs the full test suite), tell me which part to expand.
