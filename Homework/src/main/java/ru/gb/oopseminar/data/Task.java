package main.java.ru.gb.oopseminar.data;

import main.java.ru.gb.oopseminar.service.UserService;

public class Task {
    
    public String text;
    public String addDate;
    public String addTime;
    public String deadline;
    public String autorFIO;
    public Integer priority;
    public Integer id;
    
    public Task(Integer id, String text, String addDate, String addTime, String deadline, String autorFIO, Integer priority) {
        this.id = id;
        this.text = text;
        this.addDate = addDate;
        this.addTime = addTime;
        this.deadline = deadline;
        this.autorFIO = autorFIO;
        this.priority = priority;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getAddDate() {
        return addDate;
    }
    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }
    public String getAddTime() {
        return addTime;
    }
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }
    public String getDeadline() {
        return deadline;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    public String getAutorFIO() {
        return autorFIO;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriority() {
        return priority;
    }
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        String stringPriority;
        if (priority <=1) {stringPriority = "Низкий";}
        else if (priority == 2) {stringPriority = "Средний";}
        else stringPriority = "Высокий";
        
        return String.format("Id: %d, Text: %s, addDate: %s, addTime: %s, deadLine: %s, autorFIO: %s, priotity: %s", id, text, addDate, addTime, deadline, autorFIO, stringPriority);
    }


}
