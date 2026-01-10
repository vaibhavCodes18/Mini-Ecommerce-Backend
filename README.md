# 🛒 Mini Ecommerce Backend

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1-green?style=flat-square&logo=springboot)
![Hibernate](https://img.shields.io/badge/Hibernate-6.1-blue?style=flat-square&logo=hibernate)
![H2 Database](https://img.shields.io/badge/H2-Database-lightgrey?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-black?style=flat-square)

**Professional E-commerce Backend System | Spring Boot | JPA | REST APIs**

</div>

## 📌 Overview
A fully functional e-commerce backend system built with Spring Boot, implementing clean architecture, proper layer separation, and enterprise-grade error handling. This project demonstrates modern backend development practices for recruiters and hiring managers.

## ✨ Features
- ✅ **DTO Pattern** - Complete layer separation with Request/Response DTOs
- ✅ **No Entity Exposure** - Secure API design
- ✅ **RESTful APIs** - Full CRUD operations for e-commerce entities
- ✅ **JPA/Hibernate** - Robust data persistence with proper relationships
- ✅ **Comprehensive Error Handling** - Global exception handling
- ✅ **Order Management** - Complete order lifecycle with status tracking
- ✅ **Transaction Management** - ACID compliance
- ✅ **In-memory H2 Database** - Easy setup with console access


## 🛠️ Tech Stack
- **Java 17**
- **Spring Boot 3.1+**
- **Spring Data JPA**
- **Hibernate ORM**
- **H2 Database**
- **Maven**
- **Spring MVC**

## 🚀 Quick Start
### Prerequisites
- Java 17 or higher
- Maven 3.6+
- IDE (IntelliJ IDEA recommended)

### Installation
```bash
# Clone repository
git clone https://github.com/yourusername/mini-ecommerce-backend.git
cd mini-ecommerce-backend

# Build project
mvn clean install

# Run application
mvn spring-boot:run
```
### 📊 Database Schema
- **Entities**
- *User - Customer information*
- *Product - Product catalog*
- *Order - Order management*
- *OrderItem - Order details*

### Relationships
- User → Orders (One-to-Many)
- Order → OrderItems (One-to-Many)
- Product → OrderItems (Many-to-One)

### 📡 API Endpoints
1. Create User
   - POST http://localhost:8080/api/user
```
json
{
    "name": "John Doe",
    "email": "john@example.com"
}
```
2. Create Product
   - POST http://localhost:8080/api/product
```
json
{
    "productName": "Acer Aspire 7 Intel i5 13th Gen",
    "price": 50000
}
```
3. Place Order
   - POST http://localhost:8080/api/order
```
json
{
    "userId": 1,
    "orderItems": [
        {
            "productId": 1,
            "quantity": 2
        }
    ]
}
```
4. Get Order Details
   - GET http://localhost:8080/api/order/{orderId}

### 🔧 Configuration
- **application.properties**
```

server.port=8080
spring.datasource.url=jdbc:h2:mem:ecommercedb
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 👨‍💻 Author
Your Name: *Vaibhav Sathe*
- 📧 Email: vaibhav.sathe.159@gmail.com
- 🔗 LinkedIn: https://www.linkedin.com/in/vaibhav-sathe89
- 🐙 GitHub: @[vaibhavCodes18](https://github.com/vaibhavCodes18)
