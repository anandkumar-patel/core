package anand.learn.dp.solid.interfaces.good;

public class VlcMediaPlayer implements AudioMediaPlayer, VideoMediaPlayer {

	@Override
	public void playVideo() {
		System.out.println(" Playing video ..........Vlc");

	}

	@Override
	public void playAudio() {
		System.out.println(" Playing audio ..........Vlc");

	}

}
