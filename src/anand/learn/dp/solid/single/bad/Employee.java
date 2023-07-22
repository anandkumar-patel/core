package anand.learn.dp.solid.single.bad;

public class Employee {

	private String fullName;
	private String dateOfJoining;
	private String annualSalaryPackage;
	
	// getters and setters
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getAnnualSalaryPackage() {
		return annualSalaryPackage;
	}
	public void setAnnualSalaryPackage(String annualSalaryPackage) {
		this.annualSalaryPackage = annualSalaryPackage;
	}
	
	// business logic
	public long calculateEmployeeSalary(Employee emp) {
		return new Long(emp.getAnnualSalaryPackage());
	}
	
	public long calculateEmployeeLeaves(Employee emp) {
		return 0;
	}
	
	public long calculateTaxOnSalary(Employee emp) {
		return 0;
	}
	
	// data persistence logic
	public Employee saveEmployee(Employee emp) {
		return null;
	}
	
	public Employee updateEmployee(Employee emp) {
		return null;
	}
	
}
