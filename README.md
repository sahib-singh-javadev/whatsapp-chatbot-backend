# WhatsApp Chatbot Backend (Spring Boot)

## 📌 Overview

This project simulates a WhatsApp chatbot backend built using Spring Boot. It accepts messages via REST API and returns predefined responses.

## 🚀 Features

* REST API endpoint `/webhook`
* JSON request & response handling
* Layered architecture (Controller-Service-Repository)
* H2 in-memory database for logging messages
* Swagger UI for API documentation
* Input validation
* Global exception handling

## 🛠️ Tech Stack

* Java 17
* Spring Boot 3.5.12
* Spring Data JPA
* H2 Database
* Swagger (OpenAPI)

## 📡 API Example

### POST /webhook

Request:
{
"message": "Hi"
}

Response:
{
"reply": "Hello"
}

## ▶️ Run Locally

mvn spring-boot:run

## 🌐 Swagger UI

http://localhost:8080/swagger-ui/index.html

## 🗄️ H2 Database Console

http://localhost:8080/h2-console

JDBC URL:
jdbc:h2:mem:testdb

## 👨‍💻 Author

Sahibdeep Singh
