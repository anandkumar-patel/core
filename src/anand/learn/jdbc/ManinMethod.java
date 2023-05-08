package anand.learn.jdbc;

import java.sql.SQLException;
import java.util.List;


public class ManinMethod {
	public static void main(String[] args) {
		//get a particular employee
		getEmployee(5);
		
		//Get all employees
		//getEmployees();
	}
	private static void getEmployee(int id) {
		EmployeeDAO empDao = new EmployeeDAO();
		Employee employee=null;
		try {
			employee = empDao.getEmployee(id);
			if(null!=employee)
				displayEmployee(employee);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	private static void getEmployees() {
		EmployeeDAO empDao = new EmployeeDAO();
		List<Employee> employees;
		try {
			employees = empDao.getAllEmployees();
			for (Employee employee : employees) {
				displayEmployee(employee);
				//System.out.println(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	

	private static void displayEmployee(Employee employee) {
		System.out.println("Employee ID :" + employee.getId());
		System.out.println("Employee Name :" + employee.getName());
		System.out.println("Salary :" + employee.getSalary());
		System.out.println("Designation :" + employee.getDesignation());
		System.out.println();
	}
}

