# Spring Boot

| No. | Feature | Code | Documentation |
|-----|---------|------|---------------|
| 0 | ENV DB and ORM  | - | []() |
| 1 | CRUD | - | []() |
|  |  | - | []() |
|  |  | - | []() |
|  |  | - | []() |
|  |  | - | []() |
|  |  | - | []() |
|  |  | - | []() |
|  |  | - | []() |
|  |  | - | []() |
|  |  | - | []() |
|  |  | - | []() |
|  |  | - | []() |
|  |  | - | []() |
|  |  | - | []() |
|  |  | - | []() |


###### Following [Tut](https://www.youtube.com/playlist?list=PLkpN81JCp2tQhsHvGv0Rs11QefHONWsTZ)

## setting up .env in Spring
- Add following dependency in pom.xml (Property Management)
```
<dependency>
	<groupId>me.paulschwarz</groupId>
	<artifactId>spring-dotenv</artifactId>
	<version>2.5.4</version>
</dependency>
```
- Other dependencies Maven `3.9.1`
- JDK - Oracle `17.0.6`
- Spring Boot `3.0.4`

## setting up application.properties in Spring
```
spring.datasource.url=jdbc:${env.DB_DRIVER_CLASS_NAME}://${env.DB_HOST}:${env.DB_PORT}/realestate
spring.datasource.driver-class-name=org.${env.DB_DRIVER_CLASS_NAME}.Driver
spring.datasource.username=${env.DB_USERNAME}
spring.datasource.password=${env.DB_PSWD}
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.${env.SQL_DB_Dialect}
spring.jpa.properties.hibernate.format_sql=true
```

### Changing dialects in hibernate
- If you change from a MySQL dialect to a PostgreSQL dialect, then the way that timestamps are stored in the database will change.
- If you change from a dialect that uses VARCHAR columns to a dialect that uses CHAR columns, then the maximum length of strings will change.
- If you change from a dialect that supports binary data to a dialect that does not, then you will need to change the way that binary data is stored in the database.

## Architecture

### File Structure
- model
- | - User.java
- controller
- | - UserController.java
- repository
- | - UserRepository.java
- dto
- | - UserDTO.java
- | - UserMapperDTO.java
- service
- | UserService.java

### Entity
- To define a model we create a file with `class ModelName {}` and define each and every field with Annotations with `@Column` and i thave following attributes
1. 

### Controller

### Repository
- What are [Interfaces]() in Java?

### DTO(Data Transfer Object) Pattern
- What are [record]() in Java
- What are [stream]() in Java
- Class entityName implement Function in mapper

### Service

### DAO Layer