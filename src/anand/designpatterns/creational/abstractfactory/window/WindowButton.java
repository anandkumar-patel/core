package anand.designpatterns.creational.abstractfactory.window;

import anand.designpatterns.creational.abstractfactory.Button;

public class WindowButton implements Button {

	@Override
	public void paint() {
		System.out.println("WindowButton : paint() method");
	}

}
