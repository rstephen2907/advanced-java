package day1.excercise.controller;

import day1.excercise.service.TaskService;

public class TaskPresentation {

    private TaskService taskService;

    public TaskPresentation() {
        taskService = new TaskService();
    }

    public void startTheApp() {
        taskService.getAllTasksBasedOnPriority(100);
    }
}
