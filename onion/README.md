# Arquitectura Onion

La arquitectura Onion, también conocida como la Arquitectura en Cebolla, fue propuesta por **Jeffrey Palermo**. Palermo es un reconocido consultor de software y autor, conocido por su trabajo en el diseño de arquitecturas de software y en metodologías ágiles.

## Componentes Principales

1. **Núcleo de Dominio**:
   - Contiene las entidades del dominio y la lógica empresarial central.
   - Es la capa más interna y no depende de ninguna otra capa.

2. **Servicios de Dominio**:
   - Contienen la lógica específica de la aplicación que utiliza el núcleo de dominio.
   - También pueden incluir interfaces que definen cómo interactuar con servicios externos.

3. **Interfaces de Aplicación**:
   - Definen los puertos que utilizan los servicios de dominio para interactuar con el mundo exterior.
   - Pueden incluir interfaces para repositorios, servicios externos, etc.

4. **Infraestructura**:
   - Implementa las interfaces definidas en la capa de Interfaces de Aplicación.
   - Maneja las interacciones concretas con tecnologías externas como bases de datos, servicios web, frameworks, etc.

## Objetivo Principal

El objetivo principal de la arquitectura Onion es lograr una fuerte separación de preocupaciones y una alta mantenibilidad. Esto se consigue haciendo que las dependencias vayan desde las capas más externas hacia las más internas, de modo que el núcleo de dominio sea completamente independiente de las tecnologías externas y los detalles de implementación.

## Estructura del Proyecto

El proyecto está organizado en varias capas, cada una con su propia responsabilidad:

1. **Dominio**: Es el núcleo de la aplicación y se compone de dos partes:
    - **Modelos de Dominio (domainModels)**: Contiene las entidades del dominio.
    - **Servicios de Dominio (domainServices)**: Contiene servicios que utilizan las entidades en los paquetes de `domainModels`.

2. **Aplicación**: Contiene servicios y configuraciones para ejecutar la aplicación y los casos de uso. Puede utilizar los elementos del paquete `domain`, pero no debe haber ninguna dependencia del dominio hacia los paquetes de la aplicación.

3. **Adaptadores**: Contiene la lógica para conectarse a sistemas externos y/o infraestructura. Ningún adaptador puede depender de otro adaptador. Los adaptadores pueden utilizar tanto los elementos del dominio como los paquetes de la aplicación. Por el contrario, ni el dominio ni los paquetes de aplicación deben contener dependencias en ningún paquete de adaptador.

## Requisitos

- [Lenguaje de Programación]
- [Framework]
- [Dependencias adicionales]

## Instalación

Sigue estos pasos para instalar y configurar el proyecto:

1. Clona el repositorio:
    ```bash
    git clone https://github.com/tu_usuario/proyecto-onion.git
    ```
2. Navega al directorio del proyecto:
    ```bash
    cd proyecto-onion
    ```
3. Instala las dependencias:
    ```bash
    [comando de instalación de dependencias]
    ```

## Uso

Para ejecutar el proyecto, utiliza el siguiente comando:
```bash
[comando para ejecutar la aplicación]
