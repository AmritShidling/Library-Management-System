# Library Management System

## Introduction

The Library Management System is a microservice-based application designed to manage library operations, including user management, book management, and borrowing/returning functionality. The application comprises the following components:

- **API Gateway**
- **User Service**
- **Book Service**
- **Borrow Service**
- **Angular UI**

This document serves as the README file, providing detailed information about setting up, running, and using the application.

---

## Features

1. **User Management**:

   - Register new users. (With duplicate email check).
   - View user details.
   - Update and delete user information.

2. **Book Management**:

   - Add new books to the library.
   - View available books.
   - Update and delete book records.

3. **Borrowing and Returning**:

   - Borrow books by users.
   - Return borrowed books.
   - View borrowing history.
   - API to track borrowing history wrt user.
     
4. **API Gateway**:
   - Centralized entry point for all microservices.
   - Load balancing and routing.

5. **Service Discovery**:
   - For discovering and registring services.

5. **Angular UI**:
   - User-friendly web interface.
   - Access all features through a responsive design.
   - Borrowing History Dashboard, User Registration board, Available User board, Available Books board, Edit User, Edit Books Features.

---

## How to Run the Application

### Prerequisites

Ensure the following are installed on your system:

1. **Docker** (20.10 or later)
2. **Docker Compose** (1.29 or later)

### Steps to Run Using Docker (Pulling Images from Docker Hub)

1. **Pull the Repository Images**: You do not need the source code locally. Simply pull and run the application using Docker Compose.

   ```bash
   mkdir Library-Management-System
   cd Library-Management-System
   curl -O "https://github.com/AmritShidling/Library-Management-System/tree/main/docker-repository-application" (or Download this yaml file from repo https://github.com/AmritShidling/Library-Management-System/tree/main/docker-repository-application)
   docker-compose up -d
   ```

2. **Verify Services**: Ensure all services are running by executing:

   ```bash
   docker ps
   ```

3. **Access the Application**:

   - **Frontend (Angular UI)**:
     ```
     http://localhost:4200
     ```


### Steps to Run Using Source Code

If you want to clone the repository and build the application locally:

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/AmritShidling/Library-Management-System.git
   cd Library-Management-System
   ```

2. **Start Services**: Navigate to the Docker configuration directory:

   ```bash
   cd docker
   docker-compose up --build
   ```

3. **Verify Services**: Ensure all services are running by executing:

   ```bash
   docker ps
   ```

4. **Access the Application**:

   - **Frontend (Angular UI)**:
     ```
     http://localhost:4200
     ```


---

## APIs Provided

The following APIs are available through the API Gateway:

### User Service

- **POST** `v1/users` - Create a new user.
- **GET** `v1/users` - Get a list of all users.
- **GET** `v1/users/{id}` - Get details of a specific user.
- **PUT** `v1/users/{id}` - Update user details.
- **DELETE** `v1/users/{id}` - Delete a user.

### Book Service

- **POST** `v1/books` - Add a new book.
- **GET** `v1/books` - Get a list of all books.
- **GET** `v1/books/{id}` - Get details of a specific book.
- **PUT** `v1/books/{id}` - Update book details.
- **DELETE** `v1/books/{id}` - Delete a book.

### Borrow Service

- **POST** `v1/borrow` - Borrow a book.
- **POST** `v1/return` - Return a book.
- **GET** `v1/borrow/history` - Get borrowing history for all users.
- **GET** `v1/services/borrow-history/{id}` - Get borrowing history for a specific users.
---

## Folder Structure

```
root/
├── gate-way/
├── user-service/
├── book-service/
├── borrow-service/
├── library-management/ (Angular UI)
├── docker-repository-application/
│   └── docker-compose-dockerhub.yml
├── docker-compose.yml
└── README.md
```

---

## Additional Notes

1. **Database Configuration**:

   - Each service connects to its own database instance via Docker.
   - Default database configurations are provided in the `docker-compose.yml` file.

2. **Error Handling**:

   - Custom exceptions with valid HTTP response code and messages are implemented/

3. **Scalability**:

   - The microservices architecture allows independent scaling with Load Balancer, API gateway and Service Discovery.

---

## Future Enhancements

- Implemented advanced search and filter options for books with book title and author.
-	Implemented search functionality for books (by title or author).

---

Thank you for using the Library Management System! Feel free to raise issues or contribute enhancements via the repository.

