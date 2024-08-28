# School Microservices Application

![Architecture](https://github.com/TBERT31/school_microservices_app/blob/main/architecture_schema_microservices.jpg)

## Description

This project is a school management BACKEND application built using a microservices architecture with Spring Boot and Spring Cloud. It employs an Eureka server for service discovery and Zipkin for distributed tracing. The application operates with two PostgreSQL databases, each associated with a different microservice.

### Key Features:
- **Spring Boot**: The primary framework used for developing the microservices.
- **Spring Cloud**: Facilitates microservices architecture management, including configuration and service discovery.
- **Eureka Server**: Used for service discovery.
- **PostgreSQL**: Databases used for data storage in the different microservices.
- **Zipkin**: Tool used for tracing and visualizing the interaction between microservices.

## Installation

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher
- PostgreSQL
- Docker (optional, but recommended for running services in containers)

### Installation Steps

1. **Clone the repository**:
   ```bash
   git clone https://github.com/TBERT31/school_microservices_app.git
   cd school_microservices_app

2. **Set up PostgreSQL databases**:

   Create two PostgreSQL databases, one for each microservice.  
   Update the `application.properties` files in each microservice to point to the correct databases.  
   For example:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password

3. **Start the Eureka server**:

   Navigate to the `eureka-server` directory.  
   Build and run the server:
   ```bash
   mvn clean install
   mvn spring-boot:run

4. **Start the microservices**:

   For each microservice (e.g., `student-service` and `course-service`), navigate to its respective directory and run the following commands:
   ```bash
   mvn clean install
   mvn spring-boot:run

5. **Start Zipkin**:

   To start Zipkin, you can use Docker:
   ```bash
   docker run -d -p 9411:9411 openzipkin/zipkin

6. **Access the application**:

   The microservices are accessible via their respective ports configured in the `application.properties` files.  
   You can check the status of the services on the Eureka dashboard available at: `http://localhost:8761/`.  
   Zipkin is accessible at: `http://localhost:9411/`.
