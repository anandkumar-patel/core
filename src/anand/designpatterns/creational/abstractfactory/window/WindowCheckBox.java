package anand.designpatterns.creational.abstractfactory.window;

import anand.designpatterns.creational.abstractfactory.CheckBox;

public class WindowCheckBox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("WindowCheckBox : paint() method");
	}
}
