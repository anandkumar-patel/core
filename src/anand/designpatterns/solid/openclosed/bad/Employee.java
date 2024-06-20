package anand.designpatterns.solid.openclosed.bad;

public class Employee {

	private String fullName;
	private String type;
	private long basic;
	
	public long getBasic() {
		return basic;
	}
	public void setBasic(long basic) {
		this.basic = basic;
	}
	public int getWorkedDay() {
		return workedDay;
	}
	public void setWorkedDay(int workedDay) {
		this.workedDay = workedDay;
	}
	private int workedDay;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


}
