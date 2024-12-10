package com.groupe.team_todo_list;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ToDoListTest {
	  @Test
	    public void testAddTask() {
	        ToDoList todoList = new ToDoList();
	        todoList.addTask("Test task");
	        assertEquals(1, todoList.getTasks().size());
	    }

	    @Test
	    public void testGetTasks() {
	        ToDoList todoList = new ToDoList();
	        todoList.addTask("Task 1");
	        List<Task> tasks = todoList.getTasks();
	        assertEquals(1, tasks.size());
	        assertEquals("Task 1", tasks.get(0).getMessage());
	    }

	    @Test
	    public void testRemoveTask() {
	        ToDoList todoList = new ToDoList();
	        todoList.addTask("Task 1");
	        todoList.removeTask(1);
	        assertTrue(todoList.getTasks().isEmpty());
	    }

	    @Test
	    public void testUpdateTask() {
	        ToDoList todoList = new ToDoList();
	        todoList.addTask("Old Task"); // Ajoute une tâche avec ID = 1
	        todoList.updateTask(1, "Updated Task"); // Met à jour la tâche avec ID = 1

	        // Vérifie que la mise à jour a été effectuée
	        assertEquals("Updated Task", todoList.getTasks().get(0).getMessage());
	    }

	    }



