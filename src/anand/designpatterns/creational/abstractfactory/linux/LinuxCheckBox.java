package anand.designpatterns.creational.abstractfactory.linux;

import anand.designpatterns.creational.abstractfactory.CheckBox;

public class LinuxCheckBox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("LinuxCheckBox : paint() method");
	}
}
