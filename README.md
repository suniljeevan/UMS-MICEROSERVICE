Project Title
# UMS Microservice
## Description
The University Management System (UMS) is a microservices-based application that manages student and course data. 
This project allows users to perform CRUD operations on student information and course registrations, leveraging Java, Spring Boot, and Docker.
## Features
- Manage student records (create, read, update, delete)
- Register for courses
- Microservices architecture
- Dockerized application for easy deployment
- RESTful API with JWT authentication
## Tech Stack
- Java 11
- Spring Boot
- Spring Data JPA
- Docker
- MySQL
- Kubernetes (for deployment)
## Installation
### Prerequisites
- Java 11
- Maven
- Docker

### Steps to run the application locally:
1. Clone the repository:
   ```bash
   git clone https://github.com/suniljeevan/UMS-Microservice.git
Navigate to the project directory:
cd UMS-Microservice
Build the project:
mvn clean install
Run the project using Docker:
docker-compose up
## Usage
Once the application is running, you can access the API at `http://localhost:8080/api`.

Example to get all students:
```bash
curl -X GET http://localhost:8080/api/students
## API Endpoints
- `GET /api/students`: Retrieve all students
- `POST /api/students`: Create a new student
- `PUT /api/students/{id}`: Update student details
- `DELETE /api/students/{id}`: Delete a student
## Contributing
Contributions are welcome! Feel free to submit a pull request or file an issue. Follow the steps below to get started:
1. Fork the repository
2. Create a feature branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature-name`)
5. Create a new Pull Request
## License
This project is licensed under the SunilSahoo Org. License.

 If you have any specific content you want to add or need further customization, feel free to ask!
