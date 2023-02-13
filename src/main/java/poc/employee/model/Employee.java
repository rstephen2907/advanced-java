package poc.employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int empno;
	private int deptid;
	private String empName;
	private String email;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empno, int deptid, String empName, String email) {
		super();
		this.empno = empno;
		this.deptid = deptid;
		this.empName = empName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", deptid=" + deptid + ", empName=" + empName + ", email=" + email + "]";
	}
	
	

}
