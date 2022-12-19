package main.java.ru.gb.oopseminar.controller;

import java.util.ArrayList;
import java.util.List;

import main.java.ru.gb.oopseminar.data.Task;
import main.java.ru.gb.oopseminar.service.UserService;
import main.java.ru.gb.oopseminar.view.TasksView;

public class Controller {

    private final UserService userService = new UserService();
    private TasksView taskView = new TasksView();

    public List<Task> createPlanner(String text, String addDate, String addTime, String deadline, String autorFIO, Integer priority) {
        List<Task> planer = new ArrayList<>();
        userService.createPlanner(text, addDate, addTime, deadline, autorFIO, priority);
        planer = userService.getPlanner();
        return planer;
    }

    public void showPlanner() {
        List<Task> planner = userService.getPlanner();
        taskView.sendOnConsole(planner);
    }
    
}
