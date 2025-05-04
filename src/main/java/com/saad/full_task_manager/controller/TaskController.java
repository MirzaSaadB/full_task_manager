package com.saad.full_task_manager.controller;

import com.saad.full_task_manager.model.Task;
import com.saad.full_task_manager.model.User;
import com.saad.full_task_manager.repository.UserRepository;
import com.saad.full_task_manager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{userId}")
    public List<Task> getUserTasks(@PathVariable Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        return (user != null) ? taskService.getTasksByUser(user) : List.of();
    }

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTask(@PathVariable Long id) {
        return taskService.deleteTask(id);
    }

    @PutMapping
    public Task updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }
}
