
package com.mycompany.LindokuhleAtWork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Lindokuhle Zwane
 */
public class TaskTest {
    
   @Test
    public void testTaskDescriptionLength() {
        // Success Case
        Task task1 = new Task("Login Feature", "Create Login to authenticate users", "Robyn Harrison", 8, "To Do");
        assertTrue(task1.checkTaskDescription(), "Task description is within the limit");

        // Failure Case
        Task task2 = new Task("Login Feature", "This description is definitely going to be longer than fifty characters for testing purposes", "Robyn Harrison", 8, "To Do");
        assertFalse(task2.checkTaskDescription(), "Task description exceeds the limit");
    }
    
    @BeforeEach
    public void resetTaskCounter() {
        Task.resetTaskCounter();
    }

    @Test
    public void testTaskIDGeneration() {
        Task task1 = new Task("Login Feature", "Create Login to authenticate users", "Robyn Harrison", 8, "To Do");
        assertEquals("LO:0:SON", task1.getTaskID(), "Task ID is correctly generated for task 1");

        Task task2 = new Task("Add Task Feature", "Create Add Task feature to add task users", "Mike Smith", 10, "Doing");
        assertEquals("AD:1:ITH", task2.getTaskID(), "Task ID is correctly generated for task 2");
    }

    @Test
    public void testTotalHoursAccumulation() {
        // Initial tasks
        Task task1 = new Task("Login Feature", "Create Login to authenticate users", "Robyn Harrison", 8, "To Do");
        Task task2 = new Task("Add Task Feature", "Create Add Task feature to add task users", "Mike Smith", 10, "Doing");

        int totalHours = task1.returnTotalHours() + task2.returnTotalHours();
        System.out.println("Initial total hours (task 1 + task 2): " + totalHours);
        assertEquals(18, totalHours, "Total hours correctly accumulated for task 1 and task 2");

        // Additional tasks
        Task task3 = new Task("Task 3", "Description 3", "Dev 3", 10, "To Do");
        Task task4 = new Task("Task 4", "Description 4", "Dev 4", 12, "Doing");
        Task task5 = new Task("Task 5", "Description 5", "Dev 5", 55, "To Do");
        Task task6 = new Task("Task 6", "Description 6", "Dev 6", 11, "Done");
        Task task7 = new Task("Task 7", "Description 7", "Dev 7", 1, "To Do");

        totalHours += task3.returnTotalHours();
        totalHours += task4.returnTotalHours();
        totalHours += task5.returnTotalHours();
        totalHours += task6.returnTotalHours();
        totalHours += task7.returnTotalHours();

        assertEquals(107, totalHours, "Total hours correctly accumulated for additional tasks"); // Adjusted expected total hours
    }
    
}
