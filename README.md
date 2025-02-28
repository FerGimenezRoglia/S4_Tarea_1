# Ejercicios de Spring Boot con Maven y Gradle

Este repositorio contiene dos ejercicios de Spring Boot desarrollados con diferentes herramientas de construcción: **Maven** y **Gradle**. Ambos ejercicios implementan una API REST sencilla con endpoints que responden a peticiones HTTP.

---

## 📄 **Descripción**

Se han desarrollado dos versiones del mismo ejercicio:
1. **Proyecto con Maven** (`nivel1/S04T01N01`): Implementa una API REST básica con peticiones `GET`, utilizando **Maven** como herramienta de construcción.
2. **Proyecto con Gradle** (`nivel2/S04T01N02`): Implementa la misma API REST, pero utilizando **Gradle** en lugar de Maven.

Cada proyecto expone dos endpoints:
- `GET /HelloWorld`: Retorna un mensaje de saludo con un nombre por defecto o un nombre recibido como parámetro.
- `GET /HelloWorld2/{name}`: Retorna un saludo dinámico con un nombre pasado en la URL.

---

## 💻 **Tecnologías Utilizadas**

- Java 17+  
- Spring Boot 3.4.3  
- Apache Maven / Gradle  
- Postman (para pruebas de API)  

---

## 📋 **Requisitos**

Para ejecutar los proyectos, necesitas tener instalados:
- Java Development Kit (JDK 17 o superior)
- Maven (`mvn -version`) o Gradle (`gradle -version`)
- IntelliJ IDEA, Eclipse o cualquier otro IDE compatible con Spring Boot
- Postman para pruebas de API

---

## 🛠️ **Instalación y Ejecución**

### **Ejecutar el proyecto con Maven**

1. Clona el repositorio:
   ```bash
   git clone https://github.com/FerGimenezRoglia/S4_Tarea_1.git
   cd S4_Tarea_1/nivel1/S04T01N01
   ```
2. Compila el proyecto:
   ```bash
   mvn compile
   ```
3. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run
   ```

---

### **Ejecutar el proyecto con Gradle**

1. Ve al directorio del proyecto Gradle:
   ```bash
   cd S4_Tarea_1/nivel2/S04T01N02
   ```
2. Compila el proyecto:
   ```bash
   gradle build
   ```
3. Ejecuta la aplicación:
   ```bash
   gradle bootRun
   ```

---

## 📁 **Estructura del Proyecto**

```
S4_Tarea_1/
│── nivel1/
│   └── S04T01N01/  # Proyecto con Maven
│       ├── src/
│       ├── pom.xml
│       ├── mvnw, mvnw.cmd
│
│── nivel2/
│   └── S04T01N02/  # Proyecto con Gradle
│       ├── src/
│       ├── build.gradle
│       ├── gradlew, gradlew.bat
```

---

## 🔎 **Pruebas con Postman**

Para probar los endpoints, puedes usar Postman o un navegador:

### **Configurar Entorno en Postman**
1. Crea dos entornos en Postman:
   - **Proyecto Maven** con las variables:
     - `server`: `http://localhost`
     - `port`: `9000`
   - **Proyecto Gradle** con las variables:
     - `server`: `http://localhost`
     - `port`: `9001`

2. Realiza las pruebas usando los entornos creados.

### **Pruebas en Proyecto Maven** (Puerto 9000)
- `GET {{server}}:{{port}}/HelloWorld`
- `GET {{server}}:{{port}}/HelloWorld?name=TuNombre`
- `GET {{server}}:{{port}}/HelloWorld2/TuNombre`

### **Pruebas en Proyecto Gradle** (Puerto 9001)
- `GET {{server}}:{{port}}/HelloWorld`
- `GET {{server}}:{{port}}/HelloWorld?name=TuNombre`
- `GET {{server}}:{{port}}/HelloWorld2/TuNombre`

3. **Exporta los entornos en formato JSON** y súbelos junto con las capturas de pantalla de las pruebas realizadas.

---

## 📚 **Documentación**
Para más información sobre Spring Boot y cómo construir APIs REST, consulta:
- [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Maven Documentation](https://maven.apache.org/guides/)
- [Gradle Documentation](https://docs.gradle.org/current/userguide/userguide.html)
- [Postman Documentation](https://learning.postman.com/docs/getting-started/introduction/)

---

📌 **Autor:** Fer Giménez Roglia  
📌 **Fecha:** Febrero 2025
