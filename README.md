# Customer Management Spring Boot Application

This is a simple Spring Boot application for managing customer data with PostgreSQL and Swagger integration. to perform basic CRUD operaions and implement REST API methods.

## Overview

- **Spring Boot Project**: This project is built using the Spring Boot framework, providing a simple and efficient solution for managing customer information.

- **Customer Table**: The application utilizes a single table to store and manage customer data.

- **PostgreSQL Database**: The project uses a PostgreSQL database to persist customer information.

- **REST API**: The application exposes a set of RESTful APIs to perform CRUD operations on customer entities.

- **Swagger UI**: Swagger UI is integrated, allowing you to explore and test the REST APIs easily.

- **JPA Concepts**: Java Persistence API (JPA) is employed for seamless interaction with the database, simplifying the data access layer.

## Customer Table
### Attributes
  - Id (UUID)
  - First Name
  - Last Name
  - Gender
  - Age
  - Phone Number (Unique Key)

### Functions
  - Featch all Customers
  - Featch Customer by Id
  - Create a new Customer
  - Create multiple new customers
  - Update Customer data
  - Delete all Customers
  - Delete Customer by Id
