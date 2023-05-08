package anand.learn.dp.strategy;

public class HardPolice implements Strategy {
	public void processSpeeding(int speed) {
		System.out.println("Your speed is " + speed + ", and should get a ticket!");
	}
}
