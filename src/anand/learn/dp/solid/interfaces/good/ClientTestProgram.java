package anand.learn.dp.solid.interfaces.good;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {

	public static void main(String[] args) {

		// Created list of audio players
		List<AudioMediaPlayer> allPlayers = new ArrayList<>();
		allPlayers.add(new VlcMediaPlayer());
		allPlayers.add(new DivMediaPlayer());

		// Play audio in all players
		playAudioInAllMediaPlayers(allPlayers);

		// Well - all works as of now...... :-)
		System.out.println("---------------------------");

		// Now adding new Winamp player
		allPlayers.add(new WinampMediaPlayer());
		playAudioInAllMediaPlayers(allPlayers);

		// Created list of audio players
		List<VideoMediaPlayer> allVideoPlayers = new ArrayList<>();
		allVideoPlayers.add(new VlcMediaPlayer());
		allVideoPlayers.add(new DivMediaPlayer());

		// Play audio in all players
		playVideoInAllMediaPlayers(allVideoPlayers);

		// Well - all works as of now...... :-)
		System.out.println("---------------------------");

		// Now adding new Winamp player
		//allVideoPlayers.add(new WinampMediaPlayer());
		playVideoInAllMediaPlayers(allVideoPlayers);
	}

	/**
	 * This method is playing video in all players
	 * 
	 * @param allPlayers
	 */
	public static void playVideoInAllMediaPlayers(List<VideoMediaPlayer> allPlayers) {

		for (VideoMediaPlayer player : allPlayers) {
			player.playVideo();
		}
	}

	/**
	 * This method is playing audio in all players
	 * 
	 * @param allPlayers
	 */
	public static void playAudioInAllMediaPlayers(List<AudioMediaPlayer> allPlayers) {

		for (AudioMediaPlayer player : allPlayers) {
			player.playAudio();
		}
	}
}