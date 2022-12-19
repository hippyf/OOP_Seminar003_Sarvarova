package main.java.ru.gb.oopseminar.view;

import java.util.logging.Logger;
import java.util.List;

import main.java.ru.gb.oopseminar.data.Task;

public class TasksView {
    public void sendOnConsole (List<Task> planner) {
        Logger logger = Logger.getAnonymousLogger();
        for (Task task : planner) {
            logger.info(task.toString());
        }
    }
    
}
