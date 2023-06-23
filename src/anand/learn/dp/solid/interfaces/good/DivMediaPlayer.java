package anand.learn.dp.solid.interfaces.good;

public class DivMediaPlayer implements AudioMediaPlayer, VideoMediaPlayer {

	@Override
	public void playAudio() {
		System.out.println(" Playing audio ..........Div");

	}

	@Override
	public void playVideo() {
		System.out.println(" Playing video ..........Div");

	}

}
