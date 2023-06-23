package anand.learn.dp.solid.interfaces.bad;


import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {

	public static void main(String[] args) {

		// Created list of players
		List<MediaPlayer> allPlayers = new ArrayList<MediaPlayer>();
		allPlayers.add(new VlcMediaPlayer());
		allPlayers.add(new DivMediaPlayer());

		// Play video in all players
		playVideoInAllMediaPlayers(allPlayers);

		// Well - all works as of now...... :-)
		System.out.println("---------------------------");

		// Now adding new Winamp player
		allPlayers.add(new WinampMediaPlayer());
		playVideoInAllMediaPlayers(allPlayers);
	}

	/**
	 * This method is playing video in all players
	 * 
	 * @param allPlayers
	 */
	public static void playVideoInAllMediaPlayers(List<MediaPlayer> allPlayers) {

		for (MediaPlayer player : allPlayers) {
			player.playVideo();
		}
	}
}