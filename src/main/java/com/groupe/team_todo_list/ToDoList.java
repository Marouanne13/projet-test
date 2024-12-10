package com.groupe.team_todo_list;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	private static int idCounter = 1; // ID auto-incrémenté
    private List<Task> tasks = new ArrayList<>();

  
    public void addTask(String taskMessage) {
        tasks.add(new Task(idCounter++, taskMessage));
    }

   
    public List<Task> getTasks() {
        return tasks;
    }

 
    public void removeTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

   
    public void updateTask(int id, String newMessage) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setMessage(newMessage); // Met à jour le message
                break; // Quitte la boucle une fois que la tâche est trouvée
            }
        }
    }

}


class Task {
    private int id;
    private String message;


    public Task(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Task{id=" + id + ", message='" + message + "'}";
    }
    
	    
}
	
