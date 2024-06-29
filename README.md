# CRUD API

- This project is basically a RESTFul API made with Spring Boot(JAVA). The database used was PostgresSQL locally on the system.

- Easily able to do the CRUD operations in different url paths. Verified by sending the requests using POSTMAN.

### Prerequisites

Before you begin, ensure you have met the following requirements:

You have installed Java JDK 17.
You have installed Maven.
You have installed PostgreSQL.
You have installed pgAdmin 4.

### Getting Started:

Clone the Repository:
git clone https://github.com/Hexzenberg/Spring-CRUD-RESTapi.git
cd your-repository-name

### Configure the Database:

- Open pgAdmin 4 and create a new database named mydatabase.
- Create a new user (if not already created) and grant necessary privileges.
- Update the application.properties file located in src/main/resources with your PostgreSQL database details:

### properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/mydatabase
spring.datasource.username=your_postgres_username
spring.datasource.password=your_postgres_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

### Build and Run the Application

#### Navigate to the project directory and build the project using Maven:

mvn clean install

#### Run the Spring Boot application:

mvn spring-boot:run

#### Access the API:

The API will be available at http://localhost:9191. (Check the port number just to be sure though)

### API Endpoints:

Create a Product: POST /addProduct
Create Multiple Products: POST /addProducts
Get All Products: GET /products
Get Product by ID: GET /product/{id}
Update a Product: PUT /update
Delete a Product: DELETE /delete/{id}

### Example Requests:

#### Create a Product:

- json:

-- POST /addProduct:
{
    "name": "Product1",
    "quantity": 10,
    "price": 100.0
}

### Create Multiple Products:


#### POST /addProducts:

[
    {
        "name": "Product1",
        "quantity": 10,
        "price": 100.0
    },
    {
        "name": "Product2",
        "quantity": 5,
        "price": 50.0
    }
]

#### Update a Product:

-- PUT /update:
{
    "id": 1,
    "name": "Updated Product",
    "quantity": 15,
    "price": 150.0
}

### Troubleshooting
If you encounter any issues, ensure the following:

- PostgreSQL is running.
- Database configurations in application.properties are correct.
- All required dependencies are installed.
- For any further issues, please refer to the project's Issues section or raise a new issue.

### Contributing

Contributions are welcome! Please create a pull request or raise an issue for any suggestions or bug reports.

### License

This project is licensed under the MIT License - see the LICENSE file for details.

