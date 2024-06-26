# ST10381088-Lindokuhle-Zwane-PROG5121-POE-PART-2

## README

Welcome to the Lindokuhle Zwane PROG5121 POE Part 2 Project!

This project is a Java application that includes functionalities for creating accounts, logging in, and managing tasks with a GUI interface.

## 1. Prerequisites

Before you begin, ensure you have met the following requirements:
- You have installed Java Development Kit (JDK) 8 or later.
- You have installed an IDE like IntelliJ IDEA, Eclipse, or NetBeans.
- You have installed Git.

## 2. Installation

To install the project, follow these steps:

#### Steps to Clone and Open the Project

1. **Clone the Repository**

   Open your terminal or command prompt and execute the following command to clone the repository:

   ```bash
   git clone https://github.com/Leendouh/ST10381088-Lindokuhle-Zwane-PROG5121-POE-PART-2.git
   ```

2. **Open the Project in Your IDE**

   - **IntelliJ IDEA**
     1. Open IntelliJ IDEA.
     2. Click on `File` > `Open`.
     3. Navigate to the directory where you cloned the repository and select it.
     4. Click `OK` to open the project.

   - **Eclipse**
     1. Open Eclipse.
     2. Click on `File` > `Import`.
     3. Select `Existing Projects into Workspace` and click `Next`.
     4. Click on `Browse` and select the directory where you cloned the repository.
     5. Click `Finish` to import the project.

   - **NetBeans**
     1. Open NetBeans.
     2. Click on `File` > `Open Project`.
     3. Navigate to the directory where you cloned the repository and select it.
     4. Click `Open Project`.

3. **Run the Application**

   Locate the `LoginFeature` class which contains the `main` method and run it. This will start the application.

#### Project Structure

- **src/com/mycompany/LindokuhleAtWork**
  - `CreateAccount.java` : Handles user registration and login.
  - `Task.java` : Represents a task with details like name, description, developer, duration, and status.
  - `LoginFeature.java` : The main class to run the application.
 
  - To run the application, follow these steps:

1. **Navigate to the `src` directory:**

    In your IDE, locate the `src` directory which contains the Java source files.

2. **Run the `LoginFeature` class:**

    - Locate the `com.mycompany.LindokuhleAtWork.LoginFeature` class.
    - Right-click on the class and select `Run 'LoginFeature.main()'`.

## 3. Usage

The application allows you to register a new user, log in, and manage tasks. Follow the on-screen prompts to use the application.

### Example Input

When prompted for registration, enter the following details:
- First Name: `John`
- Last Name: `Doe`
- Username: `john_doe`
- Password: `Password123!`

For task management:
- Task Number: '2'
- Task Name: `Login Feature`
- Task Description: `Create Login to authenticate users`
- Developer Details: `Robyn Harrison`
- Task Duration: `8hrs`
- Task Status: `To Do`

Task 2
- For task management:
- Task Name: `Add Task Feature`
- Task Description: `Create Add Task feature to add task users`
- Developer Details: `Mike Smith`
- Task Duration: `10hrs`
- Task Status: `Doing`

- Total Hours: 18Hrs

#### Testing

The project includes unit tests to validate functionality. To run the tests:

1. Ensure you have JUnit in your project's classpath.
2. Run the test classes located in the `src` directory.

For more details, refer to the source code and comments within each class.

To run the tests, follow these steps:

1. **Locate the test classes:**

    In your IDE, navigate to the test directory which typically mirrors the `src` structure.

2. **Run the test classes:**

    - Right-click on the `TaskTest` class and select `Run 'TaskTest'`.
    - Ensure all tests pass successfully.

## 4. Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please submit an issue or create a pull request.
