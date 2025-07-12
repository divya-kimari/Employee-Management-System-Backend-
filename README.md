Employee Management System - Backend
This is a Spring Boot-based backend application for managing employee records in an organization. It provides a RESTful API to perform CRUD (Create, Read, Update, Delete) operations on employee data stored in a PostgreSQL database.

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://example.com) [![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://opensource.org/licenses/MIT) [![Version](https://img.shields.io/badge/version-1.0.0-orange.svg)](https://example.com)

🔧 Technologies Used
- Java 20
- Spring Boot 3.5.3
- Spring Data JPA
- PostgreSQL
- Maven
- IntelliJ IDEA
- Postman (for API testing)

📁 Project Structure
```plaintext
src/main/java/net/divya/ems_backend/ 
│ ├── controller # REST API controllers
│ ├── dto # Data Transfer Objects
│ ├── entity # JPA entity classes
│ ├── exception # Custom exception handling
│ ├── mapper # Mapper to convert Entity <-> DTO
│ ├── repository # Spring Data JPA repositories
│ ├── service # Service interfaces and implementations
└── EmsBackendApplication.java
```

⚙️ Getting Started
### Prerequisites
- Java JDK 20
- PostgreSQL installed and running
- Git & Maven installed
- IntelliJ IDEA or any IDE

### Run the Application
```bash
./mvnw spring-boot:run
```

🔁 API Endpoints
- **GET** `/api/employees` – Retrieve all employees
- **GET** `/api/employees/{id}` – Get employee by ID
- **POST** `/api/employees` – Create a new employee
- **PUT** `/api/employees/{id}` – Update existing employee
- **DELETE** `/api/employees/{id}` – Delete employee by ID

🧪 Sample Request Body (JSON)
```json
{
  "firstName": "Divya",
  "lastName": "Kimari",
  "email": "divya@example.com"
}
```

## Contributing
We welcome contributions! Please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Make your changes and commit them.
4. Push to your fork.
5. Create a pull request.

## Run Locally

Clone the project

```bash
git clone https://link-to-project
```

Go to the project directory

```bash
cd my-project
```

Install dependencies

```bash
npm install
```

Start the server

```bash
npm run start
```
