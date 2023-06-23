package anand.learn.dp.solid.interfaces.bad;

public class DivMediaPlayer implements MediaPlayer {
	@Override
	public void playAudio() {
		System.out.println(" Playing audio ..........");
	}

	@Override
	public void playVideo() {
		System.out.println(" Playing video ..........");
	}
}