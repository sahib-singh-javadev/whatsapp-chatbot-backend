# WhatsApp Chatbot Backend (Spring Boot)

## 📌 Overview

This project simulates a WhatsApp chatbot backend built using Spring Boot. It exposes REST APIs that accept user messages and return predefined responses. The application follows a clean layered architecture and includes API documentation and database logging.

---

## 🚀 Features

* REST API endpoints:

  * `/webhook/test` (Health Check)
  * `/webhook/message` (Chat API)
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

## 📡 API Examples

### 🔹 1. Health Check

#### GET /webhook/test

**Response**

```text
Backend is running!
```

---

### 🔹 2. Chat API

#### POST /webhook/message

**Request**

```json
{
  "message": "Hi"
}
```

**Response**

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

👉 https://whatsapp-chatbot-backend-1-7r25.onrender.com

---

### 🔗 Live API Endpoints

* Health Check:
  👉 https://whatsapp-chatbot-backend-1-7r25.onrender.com/webhook/test

* Chat API (POST):
  👉 https://whatsapp-chatbot-backend-1-7r25.onrender.com/webhook/message

---

### 📄 Swagger UI (Live)

👉 https://whatsapp-chatbot-backend-1-7r25.onrender.com/swagger-ui/index.html

---

### 📑 API Docs (JSON)

👉 https://whatsapp-chatbot-backend-1-7r25.onrender.com/v3/api-docs

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
