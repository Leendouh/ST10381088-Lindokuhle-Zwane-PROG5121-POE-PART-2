
package com.mycompany.LindokuhleAtWork;

/**
 *
 * @author Lindokuhle Zwane
 */
public class Task {

    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    private String taskStatus;
    private static int taskCounter = 0; // Static counter to generate task numbers

    // Constructor
    public Task(String taskName, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskNumber = taskCounter++;
        this.taskID = createTaskID();
    }
    
    // Method to reset taskCounter
    public static void resetTaskCounter() {
        taskCounter = 0;
    }

    // Method to check task description
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    // Method to create Task ID
    private String createTaskID() {
        String taskNamePart = taskName.length() >= 2 ? taskName.substring(0, 2).toUpperCase() : taskName.toUpperCase();
        String developerPart = developerDetails.length() >= 3 ? developerDetails.substring(developerDetails.length() - 3).toUpperCase() : developerDetails.toUpperCase();
        return taskNamePart + ":" + taskNumber + ":" + developerPart;
    }

    public String getTaskID() {
        return taskID;
    }

    // Method to print task details
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n"
                + "Developer Details: " + developerDetails + "\n"
                + "Task Number: " + taskNumber + "\n"
                + "Task Name: " + taskName + "\n"
                + "Task Description: " + taskDescription + "\n"
                + "Task ID: " + taskID + "\n"
                + "Duration: " + taskDuration + " hours";
    }

    // Method to return task duration
    public int returnTotalHours() {
        return taskDuration;
    }
}
