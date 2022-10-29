package service;

import entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
   private TaskRepository taskRepository;
    public Task saveTask(Task task){
        return taskRepository.save(task);

    }
}
