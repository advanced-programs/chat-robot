package info.hb.chat.robot.cs;

import javax.swing.SwingUtilities;

public class ChatRobotMain {

	@SuppressWarnings("restriction")
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Application.launch(Application.class, args);
		});
	}

}
