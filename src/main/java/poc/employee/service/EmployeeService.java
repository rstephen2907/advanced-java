package poc.employee.service;

import java.util.List;

import poc.employee.model.Employee;
import poc.employee.model.EmployeeStatus;

public interface EmployeeService {

	EmployeeStatus addEmployee(Employee newEmployee);

	List<Employee> getAllEmployees();

	EmployeeStatus getparticularEmployeeDetail(int empno);

	EmployeeStatus updateEmployee(Employee updatedEmployee);

	EmployeeStatus removeEmployee(int empno);

}
