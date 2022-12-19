package main.java.ru.gb.oopseminar.service;

import java.util.List;

import main.java.ru.gb.oopseminar.data.Task;

public class UserService implements DataService {
    private List<Task> planner;

    @Override
    public void createPlanner(String text, String addDate, String addTime, String deadline, String autorFIO, Integer priority) {
        Integer id = 1;
        for(Task task: this.planner) {
            task.setId(id);
            id++;
        }
        planner.add(new Task(id, text, addDate, addTime, deadline, autorFIO, priority));
        
    }

    @Override
    public List<Task> getAll() {
        // TODO Auto-generated method stub
        return this.planner;
    }

    
}
