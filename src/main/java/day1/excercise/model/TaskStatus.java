package day1.excercise.model;

public class TaskStatus {

	private int statusCode;
	private String message;
	private Task task;


	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public TaskStatus(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
	}
	

}
