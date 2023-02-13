package poc.employee.service;

import poc.employee.dao.EmployeeDao;
import poc.employee.dao.EmployeeDaoImplementation;
import poc.employee.model.Employee;
import poc.employee.model.EmployeeStatus;

import java.util.List;


public class EmployeeServiceImplementation implements EmployeeService {
	
	
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImplementation()
	{
		employeeDao =new EmployeeDaoImplementation();
	}

	@Override
	public EmployeeStatus addEmployee(Employee newEmployee) {
		// TODO Auto-generated method stub
		return employeeDao.addEmployeeDetailsFromDb(newEmployee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployeesFromdb();
	}

	@Override
	public EmployeeStatus getparticularEmployeeDetail(int empno) {
		// TODO Auto-generated method stub
		return employeeDao.getParticularEmployeeDetailFromDb(empno);
	}

	@Override
	public EmployeeStatus updateEmployee(Employee updatedEmployee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployeeInDB(updatedEmployee);

	}

	@Override
	public EmployeeStatus removeEmployee(int empno) {
		// TODO Auto-generated method stub
		return employeeDao.removeEmployeeInDb(empno);
	}

}
