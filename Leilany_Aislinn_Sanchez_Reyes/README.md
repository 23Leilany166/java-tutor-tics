# 👩‍💻 leilany-230110166
- Leilany Aislinn Sanchez Reyes
- 230110166
- 230110166@itsoeh.edu.mx

# 🌟 Proyecto **Java Tutor TICS**

Bienvenido al proyecto **Java Tutor TICS**, un espacio creado para **aprender, practicar y comprobar tus conocimientos** de **programación en Java** utilizando **JUnit 5** y **Maven**.  
Aquí no solo escribimos código, también aprendemos a **verificar que realmente funcione**. 💡

---

## 📘 ¿De qué trata este proyecto?

Este repositorio contiene varios **ejercicios y problemas prácticos** de Java diseñados para reforzar la **lógica de programación** y la **organización del código**.

Cada ejercicio tiene dos partes principales:

🧩 **1. Código fuente:**  
El programa que tú desarrollas como solución.  
📂 Se encuentra en: src/main/java/com/ejercicios/


🧪 **2. Pruebas automáticas (tests):**  
Son pequeños programas que revisan automáticamente si tu código da el resultado correcto.  
📂 Están en: src/test/java/com/ejercicios/


---

## 🧠 ¿Qué son los *tests* y por qué los usamos?

- Un **test** es una pequeña prueba automática que verifica si tu programa hace lo que debería.  
Imagina que es como un **maestro digital** que revisa tus respuestas, pero sin que tú tengas que hacerlo manualmente.

- Ejemplo:  
- Si tu función devuelve el resultado correcto → ✅ **Test aprobado**  
- Si devuelve algo incorrecto → ❌ **Test fallido**

Esto te ayuda a encontrar errores rápidamente y mejorar tu código sin miedo a romperlo.  
También te enseña a pensar de forma lógica: **entrada → proceso → salida esperada**.


## ⚙️ Cómo ejecutar los tests

Antes de ejecutar los tests, asegúrate de estar en la carpeta donde se encuentra tu archivo `pom.xml`.

### 🪄 OPCIÓN 1: Ejecutar todos los tests del proyecto
Abre la terminal en Visual Studio Code o CMD y escribe:
```bash
mvn test

- Esto compilará tu proyecto y ejecutará todas las pruebas automáticas.
- Si todo está correcto, verás: [INFO] BUILD SUCCESS

- Si hay errores: [INFO] BUILD FAILURE

### 🧪 OPCIÓN 2: Ejecutar un test específico

- mvn -Dtest=com.ejercicios.NombreDelTest test

## 📊 Interpretar los resultados

- Al finalizar, Maven mostrará un resumen como este: [INFO] Tests run: 20, Failures: 0, Errors: 0, Skipped: 0




