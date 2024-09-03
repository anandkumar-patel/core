package anand.designpatterns.creational.factory2;

public class LinuxOperatingSystem extends OperatingSystem {

	public LinuxOperatingSystem(String version, String architecture) {
		super(version, architecture);
	}

	@Override
	public void changeDir(String dirName) {
		System.out.println("LinuxOperatingSystem : changeDir() to : " + dirName);
	}

	@Override
	public void removeDir(String dirName) {
		System.out.println("LinuxOperatingSystem : removeDir() : " + dirName);
	}
}
