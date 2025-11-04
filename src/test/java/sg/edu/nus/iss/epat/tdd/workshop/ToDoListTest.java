package sg.edu.nus.iss.epat.tdd.workshop;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Collection;
import java.util.HashMap;

// import sg.edu.nus.iss.epat.tdd.workshop.task;
// import sg.edu.nus.iss.epat.tdd.workshop.toDoList;

import static org.junit.Assert.fail;

public class ToDoListTest  {
    // Define Test Fixtures
    private ToDoList toDoList;
    private Task task1;
    private Task task2;

    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        // Initialise Test Fixtures
        toDoList = new ToDoList();
        task1 = new Task("Task 1");
        task2 = new Task("Task 2");
    }

    @After
    public void tearDown() throws Exception {
        // Uninitialise test Fixtures
        toDoList = null;
        task1 = null;
        task2 = null;
    }

    @Test
    public void testAddTask() {
        toDoList.addTask(task1);
        Collection<Task> tasks = toDoList.getAllTasks();
        assertSame(tasks.size(), 1);
        assertTrue(tasks.contains(task1));
        // fail("Not implemented yet");
    }

    @Test
    public void testGetStatus() {
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.getTask(task1.getDescription()).setComplete(true);
        boolean task1Status = toDoList.getTask(task1.getDescription()).isComplete();
        boolean task2Status = toDoList.getTask(task2.getDescription()).isComplete();

        assertTrue(task1Status);
        assertFalse(task2Status);
        // fail("Not implemented yet");
    }

    @Test
    public void testRemoveTask() { // should we implement addTask when it also needs to be tested?
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.removeTask(task1.getDescription());
        assertFalse(toDoList.getAllTasks().contains(task1));
        assertTrue(toDoList.getAllTasks().contains(task2));

        // fail("Not implemented yet");
    }

    @Test
    public void testGetCompletedTasks() {
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        task1.setComplete(true);
        Collection<Task> completedTasks = toDoList.getCompletedTasks();
        assertFalse(completedTasks.contains(task2));
        assertTrue(completedTasks.contains(task1));

        // fail("Not implemented yet");
        
    }
}