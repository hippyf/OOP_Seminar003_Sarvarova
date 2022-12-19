package main.java.ru.gb.oopseminar.data;

import java.util.ArrayList;
import java.util.List;

public class Planner {
    List<Task> planner;
    private String name;

    public Planner(String name) {
        this.planner = new ArrayList<>();
        this.name = name;
    }

    public List<Task> getPlanner() {
        return planner;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}