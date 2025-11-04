package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();

   public void addTask(Task task) {
      // Add code here
      tasks.put(task.getDescription(), task);
   }

   public void completeTask(String description) {
      // Add code here
      tasks.get(description).setComplete(true);
   }

   public boolean getStatus(String description) {
      // Add code here
      if (tasks.get(description).isComplete()) { return true; };
      return false;
   }

   public Task getTask(String description) {
      // Add code here
      return tasks.get(description);
      // return null;
   }

   public Task removeTask(String description) {
      // Add code here
      return tasks.remove(description);
      // return null;
   }

   public Collection<Task> getAllTasks() {
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
      Collection<Task> completedTasks = new ArrayList<>();
      
      for (Map.Entry<String, Task> entry : tasks.entrySet()) {
                  Task task = entry.getValue();
                  if (task.isComplete()) { // make sure your Task class has this method
                     completedTasks.add(task);
                  }
            }
      return completedTasks;
      // fail("Not implemented")
   }
}
