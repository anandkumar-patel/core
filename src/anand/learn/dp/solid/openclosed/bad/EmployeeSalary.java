package anand.learn.dp.solid.openclosed.bad;

public class EmployeeSalary {

	// business logic
	public long calculateEmployeeSalary(Employee emp) {
		long salary =0;
		if(emp.getType().equalsIgnoreCase("PERMANENT")) {
			emp.getBasic();
		} else if(emp.getType().equalsIgnoreCase("CONTRACT")) {
			
		}
		return salary;
	}
}
