# Employee Management System

A RESTful Employee Management System built with **Spring Boot** and **MongoDB**. This project demonstrates CRUD operations, validation, exception handling, and API documentation using Swagger/OpenAPI.

---

## 🚀 Features

- Create a new employee
- Retrieve all employees
- Retrieve an employee by ID
- Update employee details
- Delete an employee
- Email duplicate validation
- Global exception handling
- Input validation
- Swagger/OpenAPI documentation

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data MongoDB
- MongoDB
- ModelMapper
- Jakarta Validation
- Swagger/OpenAPI (SpringDoc)
- Maven

---

## 📁 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.empolyee
│   │       ├── configuration
│   │       ├── controller
│   │       ├── controller.advice
│   │       ├── exception
│   │       ├── model
│   │       │   ├── entity
│   │       │   ├── request
│   │       │   └── enums
│   │       ├── repository
│   │       └── service
│   └── resources
│       └── application.properties
```

---

## ⚙️ Configuration

Configure MongoDB in `application.properties`.

```properties
spring.application.name=employee-service
server.port=8182

spring.data.mongodb.database=company
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
```

---

## ▶️ Running the Project

### Clone the repository

```bash
git clone https://github.com/your-username/employee-management-system.git
```

### Navigate to the project

```bash
cd employee-management-system
```

### Start MongoDB

Make sure MongoDB is running locally on:

```
localhost:27017
```

### Run the application

Using Maven:

```bash
mvn spring-boot:run
```

Or run `EmployeeServiceApplication` directly from your IDE.

---

## 📖 API Documentation

After starting the application, open Swagger UI:

```
http://localhost:8182/swagger-ui/index.html
```

---

## 📌 REST Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/employee/hello` | Welcome message |
| GET | `/employee` | Get all employees |
| GET | `/employee/{id}` | Get employee by ID |
| POST | `/employee` | Create employee |
| PUT | `/employee/{id}` | Update employee |
| DELETE | `/employee/{id}` | Delete employee |

---

## 📝 Sample Request

### Create Employee

**POST** `/employee`

```json
{
  "name": "Rahul",
  "email": "rahul@gmail.com",
  "designation": "Software Engineer",
  "jobtype": "FULL_TIME"
}
```

### Sample Response

```json
{
  "id": "687a6b5f3f4d2b7f9d123456",
  "name": "Rahul",
  "email": "rahul@gmail.com",
  "designation": "Software Engineer",
  "jobtype": "FULL_TIME"
}
```

---

## ⚠️ Error Responses

### Employee Already Exists

```json
{
  "time stamp": "2026-07-18T04:10:33",
  "status code": 409,
  "error": "Conflict",
  "message": "employee already exists"
}
```

### Employee Not Found

```json
{
  "time stamp": "2026-07-18T04:10:33",
  "status code": 404,
  "error": "Not Found",
  "message": "employee not found"
}
```

---

## 📚 Learning Outcomes

This project demonstrates:

- REST API development with Spring Boot
- MongoDB integration
- CRUD operations
- Repository pattern
- DTO to Entity mapping using ModelMapper
- Global exception handling
- Request validation
- Swagger/OpenAPI integration

---

## 👨‍💻 Author

**Your Name**

GitHub: https://github.com/lawan-11

---

## 📄 License

This project is for learning purposes and is open for educational use.