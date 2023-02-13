package poc.employee.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




import poc.employee.model.Employee;
import poc.employee.model.EmployeeStatus;

public class EmployeeDaoImplementation implements EmployeeDao {
	
	
	private Map<Integer, Employee> employees;
	
	 public EmployeeDaoImplementation() {
		// TODO Auto-generated constructor stub
		 employees =new HashMap<Integer, Employee>();
		 Employee e =new Employee(1,2,"A","A@c.com");
		 employees.put(e.getEmpno(),e);
		 e =new Employee(3,4,"B","B@c.com");
		 employees.put(e.getEmpno(),e);
		 e =new Employee(5,6,"C","C@c.com");
		 employees.put(e.getEmpno(),e);
		 
		 
		 
		 
		 
	}

	@Override
	public EmployeeStatus addEmployeeDetailsFromDb(Employee newEmployee) {
		// TODO Auto-generated method stub
		EmployeeStatus employeeStatus =new EmployeeStatus(0, "emp not added", newEmployee);
		System.out.println("keep the kid happy");
		if(!employees.containsKey(newEmployee.getEmpno()))
		{
					employees.put(newEmployee.getEmpno(),newEmployee);
					employeeStatus.setStatusCode(1);
					employeeStatus.setStatusMessage("added successfully");
			
		}
		
		
		return employeeStatus;
	}

	@Override
	public List<Employee> getAllEmployeesFromdb() {
		// TODO Auto-generated method stub
		List<Employee> employeesList =new ArrayList<Employee>();
		for(Employee e: employees.values() )
		{		
				employeesList.add(e);		
		}
		return employeesList;
	}

	@Override
	public EmployeeStatus getParticularEmployeeDetailFromDb(int empno) {
		// TODO Auto-generated method stub
		
		EmployeeStatus employeeStatus =new EmployeeStatus(0, "emp not found", new Employee());
		Employee emp = employees.get(empno);
		if( emp != null)
		{
				employeeStatus.setEmp(emp);
				employeeStatus.setStatusCode(1);
				employeeStatus.setStatusMessage("employee found");
			
		}
		return employeeStatus;
	}

	@Override
	public EmployeeStatus updateEmployeeInDB(Employee updatedEmployee) {
		// TODO Auto-generated method stub
		EmployeeStatus employeeStatus = new EmployeeStatus(0, "Employee not found",new Employee());
		Employee employee = employees.get(updatedEmployee.getEmpno());
		if (employee != null) {

			employee.setEmpName(updatedEmployee.getEmpName());
			employee.setEmail(updatedEmployee.getEmail());
			employee.setDeptid(updatedEmployee.getDeptid());
			employeeStatus.setStatusCode(1);
			employeeStatus.setStatusMessage("item updated");
		}

		return employeeStatus;

	}

	@Override
	public EmployeeStatus removeEmployeeInDb(int empno) {
		// TODO Auto-generated method stub
		EmployeeStatus employeeStatus =new EmployeeStatus(0, "emp not found", new Employee());
		Employee emp = employees.remove(empno);
		if( emp != null)
		{
					employeeStatus.setStatusCode(1);
				employeeStatus.setStatusMessage("employee removed");
			
		}
		return employeeStatus;
		
	}

}
