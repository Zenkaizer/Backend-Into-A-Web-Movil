# Práctica 3 - Proyecto de Software Basado en Plataformas

API diseñada para responder a los requerimientos establecidos en el enunciado de la práctica 3 de la asignatura de proyecto de software basado en plataformas.

## Instalación de la API

Tener Java instalado

Crear una base de datos en MySQL

Clonar el Repositorio:

```bash
git clone https://github.com/ZenkaiRed/Practica3-PSBP.git
```
En el archivo "application.properties", completar los campos faltantes donde están los "[ ]". En el campo "MYSQL PORT" por defecto es el puesto 3306. En el campo [DATABASE NAME], reemplazar por el nombre de la base de datos MySQL creada anteriormente. En el campo [PASSWORD] indicar la contraseña de la base de datos.

En caso de no funcionar, cambiar el campo "spring.datasource.username" por el username correcto.

```properties
spring.datasource.url=jdbc:mysql://localhost:[MYSQL PORT]/[DATABASE NAME]?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=[PASSWORD]

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect

#Variable de entorno
server.port=9000
```

Para iniciar el proyecto, es recomendable utilizar una IDE como IntelliJ para correr de manera correcta el proyecto de Spring con Maven.

## Archivo JSON de Postman

Dentro de la carpeta "resources", puede usar el archivo "API Practica 3 - Marcelo Céspedes.postman_collection.json" para probar las funcionalidades de la API.

## Realizado por
Marcelo Céspedes - Universidad Católica del Norte - 2023
