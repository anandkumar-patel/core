package anand.designpatterns.creational.abstractfactory;

public class AbstractFactory {
	private Button button;
	private CheckBox checkbox;
	
	public AbstractFactory(UIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckBox();
	}
	
	public void paint() {
		button.paint();
		checkbox.paint();
	}

}
