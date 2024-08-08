# Estructura de Proyecto Java con Spring Boot usando Clean Architecture

La "Clean Architecture" fue desarrollada por Robert C. Martin, también conocido como "Uncle Bob". Martin es un influyente desarrollador de software y autor, conocido por su trabajo en la promoción de buenas prácticas de programación y diseño de software. En su libro "Clean Architecture: A Craftsman's Guide to Software Structure and Design", publicado en 2017, Martin presenta los principios y patrones que componen la Clean Architecture, un enfoque que busca crear sistemas de software altamente mantenibles, flexibles y testables.

La Clean Architecture se basa en la idea de dividir el sistema en capas bien definidas, donde cada capa tiene responsabilidades específicas y limitadas. Estas capas incluyen:

- Entidades: Contienen la lógica empresarial central del dominio.
- Casos de Uso: Representan la lógica de aplicación específica.
- Interfaces de Adaptadores: Manejan la interacción con el mundo exterior (como interfaces de usuario, bases de datos, APIs).
- Frameworks y Drivers: Incluyen los detalles de implementación específicos, como frameworks web o bibliotecas de acceso a bases de datos.
El objetivo principal de la Clean Architecture es permitir que el sistema sea independiente de las tecnologías externas y fácil de modificar y extender a lo largo del tiempo.

### Paquetes Principales

#### `application`
Este paquete contiene la lógica de aplicación, casos de uso, servicios y objetos de transferencia de datos (DTOs).

- **`dto`**: Clases que representan objetos de transferencia de datos.
    - **Clases**:
        - `UserDTO`: Un ejemplo de DTO para la entidad `User`.

- **`service`**: Servicios de aplicación que coordinan casos de uso.
    - **Clases**:
        - `UserService`: Servicio de aplicación para operaciones relacionadas con `User`.

- **`usecase`**: Implementaciones de los casos de uso de la aplicación.
    - **Clases**:
        - `GetUserUseCase`: Caso de uso para obtener un `User`.

#### `domain`
Este paquete contiene la lógica del dominio, modelos y servicios de dominio.

- **`model`**: Clases de modelo de dominio que representan entidades y objetos de valor.
    - **Clases**:
        - `User`: Modelo de dominio que representa a un usuario.

- **`repository`**: Interfaces de repositorio del dominio.
    - **Interfaces**:
        - `UserRepository`: Interfaz de repositorio para operaciones con `User`.

- **`service`**: Servicios de dominio que contienen la lógica del negocio.
    - **Clases**:
        - `UserService`: Servicio de dominio para operaciones relacionadas con `User`.

#### `infrastructure`
Este paquete contiene implementaciones específicas de infraestructura, como configuraciones y adaptadores.

- **`configuration`**: Archivos de configuración de Spring y otros.
    - **Clases**:
        - `BeanConfiguration`: Configuración de Spring para definir beans.

- **`repository`**: Implementaciones de las interfaces de repositorio utilizando JPA, JDBC, etc.
    - **Clases**:
        - `JpaUserRepository`: Implementación de `UserRepository` utilizando JPA.

- **`adapter`**: Adaptadores para servicios externos, controladores REST, mensajería, etc.
    - **Clases**:
        - `ExternalUserServiceAdapter`: Adaptador para servicios externos relacionados con `User`.

#### `presentation`
Este paquete contiene la lógica de presentación, como controladores REST y manejo de excepciones.

- **`controller`**: Controladores REST que manejan las solicitudes HTTP.
    - **Clases**:
        - `UserController`: Controlador REST para gestionar usuarios.

- **`exception`**: Manejo de excepciones y errores a nivel de presentación.
    - **Clases**:
        - `GlobalExceptionHandler`: Manejo global de excepciones.

# Fuentes
- [Clean Architecture: A Craftsman's Guide to Software Structure and Design](https://www.amazon.com/Clean-Architecture-Craftsmans-Software-Structure/dp/0134494164) - Robert C. Martin