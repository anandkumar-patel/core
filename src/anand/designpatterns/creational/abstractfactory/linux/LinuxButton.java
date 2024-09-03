package anand.designpatterns.creational.abstractfactory.linux;

import anand.designpatterns.creational.abstractfactory.Button;

public class LinuxButton implements Button {

	@Override
	public void paint() {
		System.out.println("LinuxButton : paint() method");
	}
}
