# SpringMVC
Training Project in Java using Spring MVC framework that follows the Model-View-Controller architectural design pattern.

## Technologies Used
* Java 21
* Spring boot 3.2.4
* PostgreSQL 16.2
* Maven

### Dependencies
**Spring Web** -> Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container
**Spring Boot DevTools** -> Provides fast application restarts, LiveReload, and configurations for enhanced development experience
**Thymeleaf** -> A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes
**Spring Data JPA** -> Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate
**PostgreSQL Driver** -> A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard, database independent Java 

```mermaid
classDiagram
    direction LR
    Professor "1" -- "n" Disciplina
    Disciplina "n" -- "n" Aluno
    class Professor{
      +long id
      +String nome
      +BigDecimal salario
      +enum status
    }
    class Disciplina{
    }
    class Aluno{
    }
```
