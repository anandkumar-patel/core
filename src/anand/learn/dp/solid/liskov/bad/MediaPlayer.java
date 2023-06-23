package anand.learn.dp.solid.liskov.bad;

public class MediaPlayer {

	// Play audio implementation
	public void playAudio() {
		System.out.println("Playing audio...");
	}

	// Play video implementation
	public void playVideo() {
		System.out.println("Playing video...");
	}
}