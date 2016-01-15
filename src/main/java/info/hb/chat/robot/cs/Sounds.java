package info.hb.chat.robot.cs;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

@SuppressWarnings("restriction")
public class Sounds {

	public static void recieveMessage() {
		Media media = new Media(Sounds.class.getClass().getResource("gui/message.mp3").toString());
		MediaPlayer player = new MediaPlayer(media);
		player.play();
	}

	public static void connectServer() {
		Media media = new Media(Sounds.class.getClass().getResource("gui/connect.mp3").toString());
		MediaPlayer player = new MediaPlayer(media);
		player.play();
	}

	public static void disconnectServer() {
		Media media = new Media(Sounds.class.getClass().getResource("gui/disconnect.mp3")
				.toString());
		MediaPlayer player = new MediaPlayer(media);
		player.play();
	}

}
