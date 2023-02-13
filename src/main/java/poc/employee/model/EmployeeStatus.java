package poc.employee.model;

public class EmployeeStatus {
	
	private int statusCode;
	private String statusMessage;
	private Employee emp;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public EmployeeStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeStatus(int statusCode, String statusMessage, Employee emp) {
		super();
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.emp = emp;
	}
	
	

}
