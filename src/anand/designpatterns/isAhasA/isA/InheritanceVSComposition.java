package anand.designpatterns.isAhasA.isA;

public class InheritanceVSComposition {
	public static void main(String[] args) {
		Insect i = new Bee(1, "red");
		i.attack();
	}
}
