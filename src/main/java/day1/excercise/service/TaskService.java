package day1.excercise.service;

import day1.excercise.dao.TaskDao;
import day1.excercise.dao.TaskDaoImpl;
import day1.excercise.model.TaskStatus;

public class TaskService {

    TaskDao taskDao;

    public TaskService() {
        taskDao = new TaskDaoImpl();
    }

    public void getAllTasksBasedOnPriority(int priority) {
        TaskStatus taskStatus = taskDao.getAllTasksBasedOnPriority(priority);
        System.out.println(taskStatus.getMessage());
    }
}
