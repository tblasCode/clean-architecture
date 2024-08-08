# Arquitectura de Puertos y Adaptadores

La arquitectura de Puertos y Adaptadores, también conocida como la arquitectura Hexagonal, fue creada por **Alistair Cockburn**. Cockburn es un destacado consultor y autor en el campo del desarrollo de software, conocido por su trabajo en metodologías ágiles y patrones de diseño.

## Componentes Principales

1. **Núcleo de Aplicación**:
   - Contiene la lógica central del dominio.
   - No depende de ninguna tecnología externa.

2. **Puertos**:
   - Interfaces que definen cómo se comunica el núcleo de aplicación con el mundo exterior.
   - Pueden ser puertos de entrada (para recibir datos) o puertos de salida (para enviar datos).

3. **Adaptadores**:
   - Implementaciones concretas de los puertos.
   - Manejan las interacciones con tecnologías externas, como bases de datos, APIs, interfaces de usuario, etc.

## Objetivo Principal

El objetivo principal de la arquitectura Hexagonal es hacer que el núcleo de la aplicación sea independiente de los detalles de implementación, facilitando así la prueba, mantenimiento y evolución del sistema a lo largo del tiempo.


## Estructura del Proyecto

El proyecto está dividido en los siguientes módulos:

- **port**: Contiene los puertos de entrada y salida, como controladores REST y repositorios.
- **adapter**: Contiene los adaptadores de entrada y salida, como controladores REST y repositorios.
- **app**: Contiene la clase principal de la aplicación Spring Boot.
- **application**: Contiene la lógica de aplicación y los casos de uso.
- **domain**: Contiene las entidades del dominio y las interfaces de los repositorios.

## Port

El módulo `port` contiene los puertos de entrada y salida de la aplicación. Su propósito es definir las solicitudes y respuestas entre el mundo exterior y el núcleo de la aplicación.

## Adapter

El módulo `adapter` contiene los adaptadores de entrada y salida de la aplicación. Su propósito es implementar las solicitudes y respuestas entre el mundo exterior y el núcleo de la aplicación.

### Adaptadores de Entrada

Estos adaptadores manejan la interacción desde el exterior hacia la aplicación. Por ejemplo, los controladores REST que reciben solicitudes HTTP, los controladores de eventos, etc.

#### Controladores REST

Reciben solicitudes HTTP y las transforman en llamadas a los servicios del núcleo de la aplicación.

### Adaptadores de Salida

Estos adaptadores manejan la interacción desde la aplicación hacia el exterior, como repositorios que interactúan con bases de datos, clientes de servicios externos, etc.

#### Repositorios

Implementan los puertos de salida y transforman las respuestas del núcleo en un formato que pueda ser entendido por los sistemas externos.

## App

El módulo `app` contiene la clase principal de la aplicación Spring Boot. Este módulo es responsable de arrancar la aplicación y configurar el contexto de Spring.

### Clase Principal

La clase que inicializa y arranca la aplicación Spring Boot.

## Application

El módulo `application` contiene la lógica de aplicación y los casos de uso. Este módulo define cómo interactúa la lógica del negocio con el mundo exterior a través de puertos de entrada y salida.

### Casos de Uso

Servicios de aplicación que contienen la lógica específica de los casos de uso. Estos servicios implementan los puertos de entrada.

### Puertos

Interfaces que definen cómo la lógica de aplicación interactúa con el núcleo de la aplicación y el mundo exterior.

## Domain

El módulo `domain` contiene las entidades del dominio y las interfaces de los repositorios. Este módulo es independiente de las tecnologías de infraestructura y contiene la lógica del negocio pura.

### Entidades

Objetos que representan los conceptos centrales del dominio y contienen la lógica de negocio.

### Repositorios

Interfaces que definen las operaciones de persistencia necesarias para las entidades del dominio.

## Contribuir

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva característica'`).
4. Haz push a la rama (`git push origin feature/nueva-caracteristica`).
5. Abre un Pull Request.

## Requisitos

- Java 17
- Maven 3.8.1 o superior

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/hexagonal-architecture.git
   cd hexagonal-architecture
   
## Fuentes
[Hexagonal architecture por Alistair Cockburn](http://alistair.cockburn.us/Hexagonal+architecture)
[Hexagonal Architecture por Chris Fidao](http://fideloper.com/hexagonal-architecture)
[The Clean Architecture por Uncle Bob](https://8thlight.com/blog/uncle-bob/2012/08/13/the-clean-architecture.html)
[Hexagonal architecture in PHP](https://es.slideshare.net/profpv/hexagonal-architecture-in-php)