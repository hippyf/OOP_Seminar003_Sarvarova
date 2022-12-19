package main.java.ru.gb.oopseminar.service;

import java.util.ArrayList;
import java.util.List;

import main.java.ru.gb.oopseminar.data.Task;

public class UserService implements DataService {
    private  List<Task> planner;

    public UserService() {
        this.planner = new ArrayList<>();
    }

    @Override
    public void createPlanner(String text, String addDate, String addTime, String deadline, String autorFIO, Integer priority) {
        Integer id = 1;
        for(Task task: this.planner) {
            task.setId(id);
            id++;
        }
        this.planner.add(new Task(id, text, addDate, addTime, deadline, autorFIO, priority));  
        
    }

    public List<Task> getPlanner(){
        return this.planner;
    }
    

}
