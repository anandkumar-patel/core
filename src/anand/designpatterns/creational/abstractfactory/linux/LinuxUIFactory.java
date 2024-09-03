package anand.designpatterns.creational.abstractfactory.linux;

import anand.designpatterns.creational.abstractfactory.Button;
import anand.designpatterns.creational.abstractfactory.CheckBox;
import anand.designpatterns.creational.abstractfactory.UIFactory;

public class LinuxUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new LinuxCheckBox();
	}

}
