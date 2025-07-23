# CadastroDeNinjas

CadastroDeNinjas is a Java Spring Boot application designed to manage ninjas and their missions. It provides RESTful APIs for CRUD operations on ninja entities and their associated missions, making it suitable for learning, demonstration, or as a foundation for more complex systems.

## Features

- Register, update, and delete ninjas
- Assign and manage missions for ninjas
- RESTful API endpoints for all operations
- Organized code structure with controllers, models, repositories, and services

## Technologies Used

- Java 17+
- Spring Boot
- Maven

## Project Structure

```
src/main/java/dev/uevo/CadastroDeNinjas/
  ├── CadastroDeNinjasApplication.java
  ├── Ninjas/
  │   ├── Controller/
  │   ├── model/
  │   ├── repository/
  │   └── Services/
  └── Missoes/
      ├── controller/
      ├── model/
      ├── repository/
      └── Services/
```

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/simonjoseph/CadastroDeNinjas.git
   ```
2. **Navigate to the project directory:**
   ```bash
   cd CadastroDeNinjas
   ```
3. **Build the project:**
   ```bash
   ./mvnw clean install
   ```
4. **Run the application:**
   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoints

- `/ninjas` - Manage ninja entities
- `/missoes` - Manage missions

Refer to the controller classes for detailed endpoint documentation.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.
