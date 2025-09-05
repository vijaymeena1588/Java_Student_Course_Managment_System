# Java Student Course Management System

This is a Student Course Management System built using **Java** and **Spring Boot**. The application allows users to perform CRUD (Create, Read, Update, Delete) operations on student records. It uses **Maven** for dependency management and stores data in a **MySQL** database.

The purpose of this project is to serve as a simple, clear example for learning how to build a full-stack Java application with a RESTful API and a front-end for data interaction.

## Features

* **Create**: Add new student records.
* **Read**: View a list of all students.
* **Update**: Modify existing student information.
* **Delete**: Remove student records.
* **RESTful API**: Exposes endpoints for managing student data.
* **Thymeleaf Templates**: Uses Thymeleaf for server-side rendered HTML pages.

## Technologies Used

* **Backend**: Java, Spring Boot
* **Database**: MySQL
* **Build Tool**: Maven
* **Frontend**: HTML, CSS, Thymeleaf

## Getting Started

### Prerequisites

* **Java Development Kit (JDK) 17 or higher**: You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.java.net/install/index.html).
* **MySQL Server**: You will need a local MySQL instance running.
* **Maven**: This project uses the Maven Wrapper (`mvnw`), so you don't need a separate Maven installation.
* **Eclipse or other IDE**: An IDE like Eclipse or IntelliJ IDEA is recommended for development.

### Installation and Setup

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/vijaymeena1588/Java_Student_Course_Managment_System.git](https://github.com/vijaymeena1588/Java_Student_Course_Managment_System.git)
    ```

2.  **Navigate to the project directory**:
    ```bash
    cd Java_Student_Course_Managment_System
    ```

3.  **Configure the database**:
    * Open `src/main/resources/application.properties`.
    * Update the database connection settings with your MySQL credentials:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
        spring.datasource.username=your_username
        spring.datasource.password=your_password
        spring.jpa.hibernate.ddl-auto=update
        ```
    * Change `your_username` and `your_password` to your MySQL login details. The application will automatically create the `studentdb` database and the `student` table.

4.  **Run the application**:
    * **Using Maven Wrapper**:
        ```bash
        ./mvnw spring-boot:run
        ```
        (On Windows, use `mvnw.cmd spring-boot:run`)
    * **From your IDE**:
        * Import the project as a Maven project.
        * Run the `CrudApplication.java` file.

## Usage

Once the application is running, open your web browser and navigate to:

`http://localhost:8080`

You will see the main page where you can manage student records.

## Project Structure

* `src/main/java/com/student/crud/`: Contains the core Java source code.
* `src/main/java/com/student/crud/controller/`: Handles web requests.
* `src/main/java/com/student/crud/entity/`: Defines the `Student` entity.
* `src/main/java/com/student/crud/repository/`: Handles database operations.
* `src/main/resources/application.properties`: Configuration file for the application.
* `src/main/resources/templates/`: Contains the HTML templates rendered by Thymeleaf.
* `pom.xml`: The Maven build file.

## How to Run
*Start Database: Open XAMPP and start the MySQL module.

*Run in Eclipse: In Eclipse, right-click CrudApplication.java and select Run As > Spring Boot App.

*Access in Browser: Open a web browser and go to http://localhost:8081/students/list.

## Contributing

If you'd like to contribute, please fork the repository and create a pull request.

## License

This project is open-source and available under the MIT License.
