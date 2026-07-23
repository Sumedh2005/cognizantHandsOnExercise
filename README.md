# Cognizant Digital Nurture 5.0 — Deep Skilling Submission

This repository contains the hands-on exercise submissions for the **Cognizant Digital Nurture 5.0 (DN 5.0)** Deep Skilling program under the **Java Full Stack Engineer (FSE) — React** track.

---

## 👤 Candidate Details

| Field | Details |
|-------|---------|
| **Name** | Sumedh Shrikant Sawant |
| **Email** | sssumedh24@gmail.com |
| **Superset ID** | 7980591 |
| **College** | SRM Institute of Science and Technology, KTR |

---

## 📚 Program Details

| Field | Details |
|-------|---------|
| **Program** | Cognizant Digital Nurture 5.0 |
| **Track** | Java Full Stack Engineer (FSE) — React |
| **Duration** | 7 Weeks |

---

## 📂 Repository Structure

```
├── Week1/
│   ├── DesignPatterns/
│   │   ├── Exercise1_SingletonPattern/
│   │   └── Exercise2_FactoryMethodPattern/
│   └── DataStructures/
│       ├── Exercise2_EcommerceSearch/
│       └── Exercise7_FinancialForecasting/
│
├── Week2/
│   ├── PLSQL/
│   │   ├── schema_and_data.sql
│   │   ├── Exercise1_ControlStructures.sql
│   │   └── Exercise3_StoredProcedures.sql
│   └── JUnit_Mockito_SLF4J/
│       ├── pom.xml
│       ├── Exercise1_SetupJUnit/
│       ├── Exercise3_Assertions/
│       ├── Exercise4_AAAPattern/
│       ├── Exercise1_Mockito_MockingStubbing/
│       ├── Exercise2_Mockito_VerifyInteractions/
│       └── Exercise1_SLF4J_Logging/
│
├── Week3/
│   └── SpringCoreMaven/
│       ├── pom.xml
│       ├── src/main/resources/
│       │   └── applicationContext.xml
│       └── src/main/java/com/library/
│           ├── LibraryManagementApplication.java
│           ├── service/BookService.java
│           ├── repository/BookRepository.java
│           └── aspect/LoggingAspect.java
│
├── Week4/
│   └── EmployeeManagementSystem/
│       ├── pom.xml
│       ├── src/main/resources/
│       │   └── application.properties
│       └── src/main/java/com/cognizant/
│           ├── EmployeeManagementApplication.java
│           ├── entity/Employee.java
│           ├── entity/Department.java
│           ├── repository/EmployeeRepository.java
│           ├── repository/DepartmentRepository.java
│           ├── controller/EmployeeController.java
│           └── controller/DepartmentController.java
│
├── Week5/
│   └── spring-learn/
│       ├── pom.xml
│       └── src/main/
│           ├── java/com/cognizant/springlearn/
│           │   ├── SpringLearnApplication.java
│           │   ├── Country.java
│           │   ├── controller/
│           │   │   ├── HelloController.java
│           │   │   └── CountryController.java
│           │   ├── service/
│           │   │   ├── CountryService.java
│           │   │   └── exception/CountryNotFoundException.java
│           │   └── security/
│           │       ├── AuthenticationController.java
│           │       ├── AuthenticationRequest.java
│           │       ├── AuthenticationResponse.java
│           │       ├── JwtUtil.java
│           │       └── SecurityConfig.java
│           └── resources/
│               ├── application.properties
│               ├── country.xml
│               └── date-format.xml
│
└── Week6/
    └── microservices/
        ├── eureka-discovery-server/
        │   ├── pom.xml
        │   └── src/main/
        │       ├── java/com/cognizant/eurekaserver/
        │       │   └── EurekaDiscoveryServerApplication.java
        │       └── resources/application.properties
        ├── api-gateway/
        │   ├── pom.xml
        │   └── src/main/
        │       ├── java/com/cognizant/gateway/
        │       │   ├── ApiGatewayApplication.java
        │       │   └── filters/LogFilter.java
        │       └── resources/application.properties
        ├── account-service/
        │   ├── pom.xml
        │   └── src/main/
        │       ├── java/com/cognizant/account/
        │       │   ├── AccountApplication.java
        │       │   ├── controller/AccountController.java
        │       │   └── model/Account.java
        │       └── resources/application.properties
        └── loan-service/
            ├── pom.xml
            └── src/main/
                ├── java/com/cognizant/loan/
                │   ├── LoanApplication.java
                │   ├── controller/LoanController.java
                │   └── model/Loan.java
                └── resources/application.properties
```

---

## ✅ Exercises Completed

### Week 1 — Engineering Concepts
- **Design Patterns & Principles**
  - Exercise 1: Singleton Pattern (Logger)
  - Exercise 2: Factory Method Pattern (Document Management)
- **Data Structures & Algorithms**
  - Exercise 2: E-commerce Platform Search (Linear & Binary Search)
  - Exercise 7: Financial Forecasting (Recursion)

### Week 2 — Programming Languages
- **PL/SQL Programming**
  - Exercise 1: Control Structures
  - Exercise 3: Stored Procedures
- **TDD using JUnit5 & Mockito**
  - Exercise 1: Setting Up JUnit
  - Exercise 3: Assertions in JUnit
  - Exercise 4: AAA Pattern, Test Fixtures, Setup & Teardown
  - Exercise 1 (Mockito): Mocking and Stubbing
  - Exercise 2 (Mockito): Verifying Interactions
- **SLF4J Logging Framework**
  - Exercise 1: Logging Error Messages and Warning Levels

### Week 3 — Products and Frameworks (Spring Core & Maven)
- **Spring Core and Maven**
  - Exercise 1: Configuring a Basic Spring Application
  - Exercise 2: Implementing Dependency Injection
  - Exercise 4: Creating and Configuring a Maven Project

### Week 4 — Products and Frameworks (Spring Data JPA & Hibernate)
- **Spring Data JPA with Hibernate**
  - Exercise 1: Employee Management System — Setup & H2 Configuration
  - Exercise 2: Creating JPA Entities (Employee & Department with relationships)
  - Exercise 3: Creating Repositories (EmployeeRepository & DepartmentRepository)
  - Exercise 4: Implementing CRUD Operations (REST endpoints)

### Week 5 — Products and Frameworks (Spring Boot, REST & Security)
- **Spring Boot Fundamentals**
  - Basic REST endpoint with HelloController
  - Externalized configuration via `application.properties`
- **Country Service Module**
  - CountryController exposing REST endpoints backed by CountryService
  - XML-based data source (`country.xml`) and custom date formatting (`date-format.xml`)
  - Custom exception handling with `CountryNotFoundException`
- **Spring Security & JWT Authentication**
  - AuthenticationController for login/token issuance
  - JWT generation and validation via `JwtUtil`
  - Request/response DTOs (`AuthenticationRequest`, `AuthenticationResponse`)
  - Security configuration (`SecurityConfig`) securing REST endpoints

### Week 6 — Microservices Architecture
- **Eureka Discovery Server**
  - Service registry setup for microservice discovery
- **API Gateway**
  - Spring Cloud Gateway routing requests to downstream services
  - Custom logging filter (`LogFilter`) for request/response tracing
- **Account Service**
  - Standalone microservice with REST controller and `Account` model
  - Registered with Eureka for service discovery
- **Loan Service**
  - Standalone microservice with REST controller and `Loan` model
  - Registered with Eureka for service discovery

---

## 🛠️ Tech Stack

- Java 11
- Maven
- Spring Framework 5.3
- Spring Boot 2.7
- Spring Data JPA
- Hibernate
- H2 In-Memory Database
- Spring AOP + AspectJ
- Spring Security + JWT
- Spring Cloud (Eureka, Gateway)
- Microservices Architecture
- JUnit 4
- Mockito
- SLF4J + Logback
- PL/SQL (Oracle)
- Git & GitHub