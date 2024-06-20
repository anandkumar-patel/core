package anand.java8;

public class Employee {
	private int empId;
	private String empName;
	private Long empSalary;
	private Boolean isActive;
	public Employee(int empId, String empName, Long empSalary, Boolean isActive) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.isActive = isActive;
	}
	public int getEmpId() {
		return empId;
	}	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Long empSalary) {
		this.empSalary = empSalary;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", isActive="
				+ isActive + "]";
	}

}
