package day1.excercise.dao;

import day1.excercise.model.TaskStatus;

public interface TaskDao {

    TaskStatus getAllTasksBasedOnPriority(int priority);


}
