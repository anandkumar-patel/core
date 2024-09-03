package anand.designpatterns.creational.factory2;

public class MainMethod {

	public static void main(String[] args) {
		
		OperatingSystem ob1 = OperatingSystemFactory.getOperatingSystemInstance("window", "18.0", "amd");
		OperatingSystem ob2 = OperatingSystemFactory.getOperatingSystemInstance("linux", "10.0", "intel");
		
		System.out.println(ob1.getArchitecture());
		System.out.println(ob2.getArchitecture());
		
		if(ob1 instanceof WindowOperatingSystem) {
			System.out.println("Yes1");
		}
		
		if(ob1.getClass()== WindowOperatingSystem.class) {
			System.out.println("Yes2");
		}
	}

}
