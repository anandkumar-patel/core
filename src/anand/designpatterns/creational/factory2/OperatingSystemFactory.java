package anand.designpatterns.creational.factory2;

public class OperatingSystemFactory {

	private OperatingSystemFactory() {

	}

	public static OperatingSystem getOperatingSystemInstance(String type, String version, String architecture) {
		switch (type) {
		case "linux":
			return new LinuxOperatingSystem(version, architecture);
		case "window":
			return new WindowOperatingSystem(version, architecture);
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
}
