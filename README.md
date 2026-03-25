# WhatsApp Chatbot Backend (Spring Boot)

## 📌 Overview

This project simulates a WhatsApp chatbot backend built using Spring Boot. It exposes a REST API that accepts user messages and returns predefined responses. The application follows a clean layered architecture and includes API documentation and database logging.

---

## 🚀 Features

* REST API endpoint `/webhook`
* JSON request & response handling
* Layered architecture (Controller → Service → Repository)
* H2 in-memory database for logging messages with timestamp
* Swagger UI for API documentation and testing
* Input validation using `@Valid`
* Global exception handling

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot 3.5.12
* Spring Data JPA
* H2 Database
* Swagger (OpenAPI)

---

## 📡 API Example

### POST /webhook

#### Request

```json
{
  "message": "Hi"
}
```

#### Response

```json
{
  "reply": "Hello"
}
```

---

## ▶️ Run Locally

```bash
mvn spring-boot:run
```

---

## 🌐 Live Deployment

The application is deployed on Render:

👉 https://.onrender.com

### Swagger UI (Live)

👉 https://your-app.onrender.com/swagger-ui/index.html

---

## 🧪 Local Swagger UI

http://localhost:8080/swagger-ui/index.html

---

## 🗄️ H2 Database Console

http://localhost:8080/h2-console

**JDBC URL:**

```
jdbc:h2:mem:testdb
```

---

## ⚠️ Note

H2 is an in-memory database, so data will be reset whenever the application restarts.

---

## 👨‍💻 Author

Sahibdeep Singh
