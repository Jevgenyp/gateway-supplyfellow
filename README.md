# Gateway-Supplyfellow

This is a Spring Boot application that acts as an API Gateway for the Supplyfellow project.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 17
- Maven
- Spring Boot 3.2.4

### Installing

1. Clone the repository
2. Navigate to the project directory
3. Run `mvn clean install` to build the project
4. Run `mvn spring-boot:run` to start the application

The application will start running at `http://localhost:8080`.

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)
- [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)
- [Spring Cloud Netflix Eureka](https://spring.io/projects/spring-cloud-netflix)

## Services

The gateway routes to the following services:

- Chat Service: All requests with path `/chat/**`
- Product Service: All requests with path `/products/**`

## Authors

- Jevgenyp
