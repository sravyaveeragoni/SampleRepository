package controller;

import entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TaskService;

@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    TaskService taskService;


    @PostMapping("/tasks")
    public Task addTask( @RequestBody Task task){
        return taskService.saveTask(task);

    }
}
