# Arquitectura N-Layered

## Descripción

Este es un proyecto de arquitectura N-Layered, diseñado para demostrar la separación de responsabilidades y la escalabilidad de aplicaciones empresariales en Java. El proyecto está dividido en cuatro capas principales: Config, Domain, Service y Web.

## Estructura del Proyecto

- **Config:** Contiene la configuración del proyecto, incluyendo entornos y variables de entorno.
- **Domain:** Define las entidades del dominio y las reglas de negocio básicas.
- **Service:** Implementa la lógica de negocio y las operaciones sobre las entidades del dominio.
- **Web:** Maneja las solicitudes HTTP y expone los endpoints de la API.

## Instalación

1. Clonar el repositorio:
    ```sh
    git clone https://github.com/usuario/proyecto-n-layered-java.git
    ```
2. Navegar al directorio del proyecto:
    ```sh
    cd proyecto-n-layered-java
    ```
3. Importar el proyecto en tu IDE de preferencia (IntelliJ IDEA, Eclipse, etc.).
4. Configurar las variables de entorno en un archivo `.env` (opcional).
5. Construir el proyecto con Maven:
    ```sh
    mvn clean install
    ```

## Uso

1. Iniciar la aplicación:
    ```sh
    mvn spring-boot:run
    ```
2. Acceder a la aplicación en `http://localhost:8080`.

## Estructura de Directorios

```plaintext
proyecto-n-layered-java/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── proyecto/
│   │   │   │       ├── config/
│   │   │   │       ├── domain/
│   │   │   │       ├── service/
│   │   │   │       └── web/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── ...
│   └── test/
│       └── java/
│           └── com/
│               └── proyecto/
│                   ├── domain/
│                   ├── service/
│                   └── web/
│
└── pom.xml
