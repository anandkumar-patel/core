package anand.util.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyEmployee {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);

		Map<Employee,Integer> map1 = new HashMap<>();
		map1.put(emp1, 1);
		map1.put(emp2, 1);
		System.out.println("Size of map is :"+ map1.size());
		
		Integer in1 = Integer.valueOf(1);
		Integer in2 =  Integer.valueOf(1);
		Map<Integer,String> map2 = new HashMap<>();
		map2.put(in1, "data");
		map2.put(in2, "data");
		System.out.println("Size of map is :"+ map2.size());
	}

}

/*
 * remove the overridden method(equals and hashCode) 
 * and check the size 
 *
 */
class Employee {
	int empId;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}

	public Employee(int empId) {
		this.empId = empId;
	}

}
