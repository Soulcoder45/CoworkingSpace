# CoworkingSpace
Pagina web del equipo SpringMasters

# Sistema de Reservas - Configuración del archivo `application.properties`

Este proyecto utiliza Spring Boot y una base de datos MySQL. Para poder ejecutarlo localmente, es necesario configurar correctamente el archivo `application.properties` de acuerdo con tu entorno de desarrollo.

A continuación, te mostramos los pasos necesarios para configurar este archivo.

---

## 1. Copiar el archivo `application.properties.example`

Antes de comenzar, copia el archivo `application.properties.example` que se encuentra en el repositorio y renómbralo a `application.properties`.

## 2. Configurar el archivo `application.properties`

Edita el archivo `application.properties` recién copiado y reemplaza los valores entre `< >` con las credenciales que se pasaron por discord:

```properties
spring.datasource.url=jdbc:mysql://<host>:<puerto>/<nombre_base_de_datos>
spring.datasource.username=<usuario>
spring.datasource.password=<contraseña>