package com.mycompany.LindokuhleAtWork;

import javax.swing.*;

/**
 *
 * @author Lindokuhle Zwane
 */
public class LoginFeature {

    public static void main(String[] args) {
        CreateAccount objCreateAccount = new CreateAccount();

        // Initialize task variables
        String allTaskDetails = "";
        int totalHours = 0;

        // Register a new user
        String newName = JOptionPane.showInputDialog(null, "Enter your first name", "Registration", JOptionPane.QUESTION_MESSAGE);
        if (newName == null) {
            return;
        }

        String newSurname = JOptionPane.showInputDialog(null, "Enter your last name", "Registration", JOptionPane.QUESTION_MESSAGE);
        if (newSurname == null) {
            return;
        }

        String newUsername = JOptionPane.showInputDialog(null, "Enter a username", "Registration", JOptionPane.QUESTION_MESSAGE);
        if (newUsername == null) {
            return;
        }

        String newPassword = JOptionPane.showInputDialog(null, "Enter a password", "Registration", JOptionPane.QUESTION_MESSAGE);
        if (newPassword == null) {
            return;
        }

        String registrationResult = objCreateAccount.registerUser(newName, newSurname, newUsername, newPassword);
        JOptionPane.showMessageDialog(null, registrationResult, "Registration", JOptionPane.INFORMATION_MESSAGE);
        if (!registrationResult.equals("Registration successful!")) {
            return;
        }

        // Login
        String inputUsername = JOptionPane.showInputDialog(null, "Enter your username", "Login", JOptionPane.QUESTION_MESSAGE);
        if (inputUsername == null) {
            return;
        }

        String inputPassword = JOptionPane.showInputDialog(null, "Enter your password", "Login", JOptionPane.QUESTION_MESSAGE);
        if (inputPassword == null) {
            return;
        }

        String loginStatus = objCreateAccount.returnLoginStatus(inputUsername, inputPassword);
        JOptionPane.showMessageDialog(null, loginStatus, "Login", JOptionPane.INFORMATION_MESSAGE);
        if (!loginStatus.startsWith("Successful")) {
            return;
        }

        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban", "Welcome", JOptionPane.INFORMATION_MESSAGE);

        // Main loop
        boolean quit = false;
        while (!quit) {
            String menuOption = JOptionPane.showInputDialog(null, "Select an option:\n1) Add tasks\n2) Show report\n3) Quit", "Menu", JOptionPane.QUESTION_MESSAGE);
            if (menuOption == null) {
                return;
            }

            switch (menuOption) {
                case "1":
                    int numberOfTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks would you like to enter?", "Task Entry", JOptionPane.QUESTION_MESSAGE));
                    for (int k = 0; k < numberOfTasks; k++) {
                        String taskName = JOptionPane.showInputDialog(null, "Enter the task name:", "Task Entry", JOptionPane.QUESTION_MESSAGE);
                        String taskDescription = JOptionPane.showInputDialog(null, "Enter the task description (50 characters max):", "Task Entry", JOptionPane.QUESTION_MESSAGE);
                        if (taskDescription.length() > 50) {
                            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters", "Error", JOptionPane.ERROR_MESSAGE);
                            k--;
                            continue;
                        }

                        String developerDetails = JOptionPane.showInputDialog(null, "Enter the developer details:", "Task Entry", JOptionPane.QUESTION_MESSAGE);
                        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the task duration (in hours):", "Task Entry", JOptionPane.QUESTION_MESSAGE));
                        String taskStatus = (String) JOptionPane.showInputDialog(null, "Select the task status:", "Task Entry", JOptionPane.QUESTION_MESSAGE, null, new String[]{"To Do", "Done", "Doing"}, "To Do");

                        Task newTask = new Task(taskName, taskDescription, developerDetails, taskDuration, taskStatus);
                        totalHours += taskDuration;
                        allTaskDetails += newTask.printTaskDetails() + "\n\n";
                        JOptionPane.showMessageDialog(null, "Task successfully captured\n" + newTask.printTaskDetails(), "Task Entry", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Coming Soon", "Report", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "3":
                    quit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please select 1, 2, or 3.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }

        // Display total hours
        JOptionPane.showMessageDialog(null, "Total task hours: " + totalHours + "\n\nTask Details:\n" + allTaskDetails, "Summary", JOptionPane.INFORMATION_MESSAGE);
    }
}
