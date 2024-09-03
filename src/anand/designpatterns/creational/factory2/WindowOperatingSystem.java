package anand.designpatterns.creational.factory2;

public class WindowOperatingSystem extends OperatingSystem {

	public WindowOperatingSystem(String version, String architecture) {
		super(version, architecture);
	}

	@Override
	public void changeDir(String dirName) {
		System.out.println("WindowOperatingSystem : changeDir() to : " + dirName);
	}

	@Override
	public void removeDir(String dirName) {
		System.out.println("WindowOperatingSystem : removeDir() : " + dirName);
	}
}
