package main.java.com.example.todo.service;

import main.java.com.example.todo.model.Task;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    // Our in-memory database (an Array List!)
    private List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    // CREATE
    public Task createTask(Task task) {
        task.setId(nextId++);
        tasks.add(task);
        return task;
    }

    // READ (Get all)
    public List<Task> getAllTasks() {
        return tasks;
    }

    // READ (Get by ID)
    public Optional<Task> getTaskById(Long id) {
        return tasks.stream().filter(t -> t.getId().equals(id)).findFirst();
    }

    // UPDATE
    public Task updateTask(Long id, Task updatedTask) {
        Task task = getTaskById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setTitle(updatedTask.getTitle());
        task.setCompleted(updatedTask.isCompleted());
        return task;
    }

    // DELETE
    public void deleteTask(Long id) {
        tasks.removeIf(t -> t.getId().equals(id));
    }
}