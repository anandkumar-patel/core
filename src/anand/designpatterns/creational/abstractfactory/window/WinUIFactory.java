package anand.designpatterns.creational.abstractfactory.window;

import anand.designpatterns.creational.abstractfactory.Button;
import anand.designpatterns.creational.abstractfactory.CheckBox;
import anand.designpatterns.creational.abstractfactory.UIFactory;

public class WinUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		return new WindowButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WindowCheckBox();
	}

}
