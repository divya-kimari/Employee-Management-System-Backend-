# Employee Management System - Backend

This is a Spring Boot-based backend application for managing employee records in an organization. 
It provides a RESTful API to perform CRUD (Create, Read, Update, Delete) operations on employee data stored in a PostgreSQL database.

## 🔧 Technologies Used

- Java 20
- Spring Boot 3.5.3
- Spring Data JPA
- PostgreSQL
- Maven
- IntelliJ IDEA
- Postman (for API testing)

## 📁 Project Structure

src/main/java/net/divya/ems_backend/
│
├── controller # REST API controllers
├── dto # Data Transfer Objects
├── entity # JPA entity classes
├── exception # Custom exception handling
├── mapper # Mapper to convert Entity <-> DTO
├── repository # Spring Data JPA repositories
├── service # Service interfaces and implementations
└── EmsBackendApplication.java


## ⚙️ Getting Started

### ✅ Prerequisites

- Java JDK 20
- PostgreSQL installed and running
- Git & Maven installed
- IntelliJ IDEA or any IDE

## Run the Application
./mvnw spring-boot:run

## Test with Postman
Base URL: http://localhost:8080/api/employees

🔁 API Endpoints
GET /api/employees – Retrieve all employees
GET /api/employees/{id} – Get employee by ID
POST /api/employees – Create a new employee
PUT /api/employees/{id} – Update existing employee
DELETE /api/employees/{id} – Delete employee by ID

🧪 Sample Request Body (JSON)
{
  "firstName": "Divya",
  "lastName": "Kimari",
  "email": "divya@example.com"
}
