package anand.designpatterns.creational.abstractfactory;

import anand.designpatterns.creational.abstractfactory.window.WinUIFactory;

public class MainMethod {

	public static void main(String[] args) {
		AbstractFactory obj = new AbstractFactory(new WinUIFactory());
		
		obj.paint();
	}

}
