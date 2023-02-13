package day1.excercise.dao;

import day1.excercise.model.Task;
import day1.excercise.model.TaskStatus;

import java.util.ArrayList;
import java.util.List;

public class TaskDaoImpl implements TaskDao {

    private final List<Task> taskList = new ArrayList<>();

    public TaskDaoImpl() {
        Task task1 = new Task(101, "taskA", 3);
        Task task2 = new Task(102, "taskB", 0);
        Task task3 = new Task(103, "taskC", 4);
        Task task4 = new Task(104, "taskD", 2);
        Task task5 = new Task(105, "taskE", 3);

        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);
        taskList.add(task5);
    }


    @Override
    public TaskStatus getAllTasksBasedOnPriority(int priority) {
        List<Task> filteredTasks = taskList.stream().filter(task -> task.getPriority() == priority).toList();

        if (filteredTasks.isEmpty())
            return new TaskStatus(404, "No tasks available of given priority");

        filteredTasks.forEach(System.out::println);

        return new TaskStatus(200, "Listed all tasks of given priority");
    }
}
