package main.java.ru.gb.oopseminar.service;

import java.util.List;
import main.java.ru.gb.oopseminar.data.Task;

public interface DataService {
    void createPlanner(String text, String addDate, String addTime, String deadline, String autorFIO, Integer priority);
    List<Task> getAll();
    
}
