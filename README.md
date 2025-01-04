
# Spring Boot Fundamentals

A Spring Boot-based application showcasing the integration of key Spring components, such as controllers, beans, and application configurations. This project demonstrates the fundamentals of building a simple yet scalable backend service.

---


## Table of Contents

1. [Features](#features)  
2. [Project Structure](#project-structure)  
3. [Technologies Used](#technologies-used)  
4. [Setup Instructions](#setup-instructions)  
5. [Usage](#usage)  
6. [Endpoints](#endpoints)  
7. [Code Overview](#code-overview)  
8. [Contributing](#contributing)  
9. [License](#license)  

---

## Features

- **Spring Boot Integration**: Core Spring Boot features such as `@Component`, `@Controller`, and `@Configuration`.  
- **Dependency Injection**: Demonstrates how Spring manages beans with `@Component` and `@Bean` annotations.  
- **REST API**: A simple endpoint to return a greeting message.  
- **Custom Beans**: Handles `Student` objects with encapsulated properties and a display method.  
- **CommandLineRunner**: Executes code at application startup for initializing tasks.  

---

## Project Structure

```
src/main/java/com/romeocoder/
│
├── Bean/
│   └── Student.java         # Student entity with properties and methods
     |__ MyClass.java        # A Spring-managed component for message printing
│
├── Config/
│   └── AppConfiguration.java # Configures and initializes beans at runtime
│
├── Controller/
│   └── MyController.java     # REST controller with a GET endpoint
│
           
│
└── Application.java          # Entry point of the Spring Boot application
```

---

## Technologies Used

- **Java**: Programming language.  
- **Spring Boot**: Framework for building backend services.  
- **Maven**: Dependency and build management.  

---

## Setup Instructions

### Prerequisites
1. Java Development Kit (JDK) 11 or higher.  
2. Maven installed and configured.  
3. IDE (e.g., IntelliJ IDEA, Eclipse) for development.  

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/username/repository-name.git
   ```
2. Navigate to the project directory:
   ```bash
   cd repository-name
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. Access the application:
   - Open a browser and navigate to: `http://localhost:8080`.

---

## Usage

### Example Output
- Accessing the `/` endpoint returns:
  ```plaintext
  hello from springBoot
  ```

- Upon startup, the following student details are logged:
  ```plaintext
  Name: Milan Parajuli
  Id: 3030
  Marks: 80.0

  Name: Shisir Parajuli
  Id: 3031
  Marks: 60.0
  ```

---

## Endpoints

| Method | Endpoint | Description              |
|--------|----------|--------------------------|
| GET    | `/`      | Returns a greeting message.|

---

## Code Overview

### Key Classes
1. **`Student`**:
   - Encapsulates `name`, `id`, and `marks`.
   - Provides getter, setter, and a `displayStudentDetails` method.

2. **`AppConfiguration`**:
   - Configures and registers beans for `Student` entities.
   - Uses `CommandLineRunner` to initialize logic at application startup.

3. **`MyClass`**:
   - A utility component to print personalized messages.

4. **`MyController`**:
   - Handles HTTP GET requests and returns a greeting message.

5. **`Application`**:
   - The main entry point of the Spring Boot application.
   - Demonstrates the use of beans and a custom `CommandLineRunner` implementation.

---

## Contributing

We welcome contributions to improve this project. To contribute:
1. Fork this repository.  
2. Create a feature branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add feature-name"
   ```
4. Push the branch and create a Pull Request.

---

## License

This project is licensed under the [MIT License](LICENSE).

--- 
