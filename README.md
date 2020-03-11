# Getting Started

## Description

Fully reactive shop cart REST API.

### Prerequisites
- Enable annotation processors (in your IDE for lombok)

### Architecture
- Reactive Layers architecture (spring-framework reactor).
- Java non-blocking functional programming: reactor+streams.
- REST API's with Spring-WebFlux.
    - Using [Functional Programming Model](https://docs.spring.io/spring-framework/docs/5.0.0.BUILD-SNAPSHOT/spring-framework-reference/html/web-reactive.html#_functional_programming_model)

Notes:
- BeanValidation implementation.
- Reactive junit tests (of course).
- No security implementation at all.
- No persistence implementation.
- Sonar gradle plugin
    - you can run sonarqube gradle task if you have sonar installed on localhost:9000
    - or see the [Sonarcloud.io](https://sonarcloud.io/dashboard?id=com.dgf%3AshopCart) dashboard for this project.
  
### Try it
- Run App as a spring-boot app:
    - command line: `gradlew :bootRun`
    - intellij: right button on `App.java` & Run...

- Use `postman_collection.json` (importing the json file in Postman client):
    - `add`: to add an item to the cart
    - `list`: to see all items in the cart

# Initial setup reference

## Travis & sonarcloud setup

Create a token for this project: https://sonarcloud.io/account/security/

Encrypt key (in project folder)
    
    travis encrypt --pro <keyCreatedInSonarCloud>
    