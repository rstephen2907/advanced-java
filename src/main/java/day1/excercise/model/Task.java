package day1.excercise.model;

public class Task {

    private int taskId;

    private String taskName;

    private int priority;

    public Task(int taskId, String taskName, int priority) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", priority=" + priority +
                '}';
    }
}
