package main.java.ru.gb.oopseminar;

import main.java.ru.gb.oopseminar.controller.Controller;

public class App {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createPlanner("Сделать ДЗ","18.12.2022", "15.00", "до 19.12.2022 19.00", "Сарварова Яна Вячеславовна", 3);
        controller.createPlanner("Проверить ДЗ","18.12.2022", "15.10", "до 19.12.2022 19.30", "Сарварова Яна Вячеславовна", 2);
        controller.createPlanner("Отправить ДЗ","18.12.2022", "15.20", "жо 19.12.2022 19.00", "Сарварова Яна Вячеславовна", 3);
        controller.showPlanner();
    }
}
