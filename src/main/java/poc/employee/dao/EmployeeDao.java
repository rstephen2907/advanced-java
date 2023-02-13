package poc.employee.dao;

import java.util.List;

import poc.employee.model.Employee;
import poc.employee.model.EmployeeStatus;

public interface EmployeeDao {

	EmployeeStatus addEmployeeDetailsFromDb(Employee newEmployee);

	List<Employee> getAllEmployeesFromdb();

	EmployeeStatus getParticularEmployeeDetailFromDb(int empno);

	EmployeeStatus updateEmployeeInDB(Employee updatedEmployee);

	EmployeeStatus removeEmployeeInDb(int empno);

}
