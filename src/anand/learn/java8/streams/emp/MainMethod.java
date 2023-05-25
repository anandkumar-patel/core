package anand.learn.java8.streams.emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Set;

public class MainMethod {

	public static void main(String[] args) {

		List<Employee> empList = getEmployeeList();
		// print the employee name of 3 least sallary getter active employee in
		// reverse of there salary.
		
		System.out.println("List of Employee Names:");
		List<String> empNames = empList.stream().sorted(Comparator.comparingLong(Employee::getEmpSalary).reversed())
				.filter(Employee::getIsActive).limit(3).map(Employee::getEmpName).collect(Collectors.toList());
		empNames.stream().forEach(System.out::println);
		System.out.println("**************************************************");
		// list the active employees in salary desc order
		System.out.println("List of Employee :");
		List<Employee> activeEmpList = empList.stream().filter(Employee::getIsActive)
				.sorted(Comparator.comparingLong(Employee::getEmpSalary).reversed()).collect(Collectors.toList());
		activeEmpList.stream().forEach(emp -> System.out.println(emp.toString()));
		System.out.println("**************************************************");
		
		System.out.println("Set of Employee Name :");
		Set<String> activeEmpSet = empList.stream().map(Employee::getEmpName).collect(Collectors.toSet());

		activeEmpSet.stream().forEach(emp -> System.out.println(emp.toString()));
		System.out.println("**************************************************");
		
		
		System.out.println("Map of Employee Name :");
		Map<Integer,String> activeEmpMap1 = empList.stream().collect(Collectors.toMap(Employee::getEmpId,Employee::getEmpName));
		Map<Integer,String> activeEmpMap2 = empList.stream().collect(Collectors.toMap(emp->emp.getEmpId(),emp->emp.getEmpName()));
		Map<Integer,Employee> activeEmpMap = empList.stream().collect(Collectors.toMap(emp->emp.getEmpId(), emp->emp));

		for(Integer keys : activeEmpMap.keySet()) {
			System.out.println(activeEmpMap.get(keys));
		}
		System.out.println("********************{ grouping }******************************");
		
		
		System.out.println(empList.stream().collect(Collectors.groupingBy(emp->emp.getEmpName())));
		
		System.out.println(empList.stream().collect(Collectors.groupingBy(emp->emp.getEmpName(),Collectors.mapping(emp->emp.getEmpId(), Collectors.toList()))));
			
		
	}

	private static List<Employee> getEmployeeList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1112, "Anand", 1234L, true));
		empList.add(new Employee(1113, "Patel", 1245L, true));
		empList.add(new Employee(1114, "Kumar", 2123L, false));
		empList.add(new Employee(1115, "Yas", 3421L, false));
		empList.add(new Employee(1116, "Singh", 1428L, true));
		empList.add(new Employee(1117, "Yadav", 2534L, true));
		empList.add(new Employee(1118, "Udham", 2495L, true));
		empList.add(new Employee(1119, "Singh", 1923L, false));
		empList.add(new Employee(1120, "Brijesh", 3242L, false));
		empList.add(new Employee(1121, "Patel", 1258L, true));
		return empList;
	}

}
