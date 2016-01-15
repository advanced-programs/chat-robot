package info.hb.chat.robot.cs;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class Application extends javafx.application.Application {

	// Constants
	public static final String VERSION = "v2.0";
	public static final String RELEASED = "2016-01-15";

	@Override
	public void start(Stage stage) throws Exception {
		// Create loader
		FXMLLoader loader = new FXMLLoader(getClass().getResource("gui/Client.fxml"));
		ClientControl controller = new ClientControl();
		loader.setController(controller);

		// Create scene
		Scene scene = new Scene((Parent) loader.load());
		controller.init(scene);
		controller.init(stage);

		// Add icons
		stage.getIcons().add(new Image(getClass().getResourceAsStream("gui/logo-16.png")));
		stage.getIcons().add(new Image(getClass().getResourceAsStream("gui/logo-32.png")));
		stage.getIcons().add(new Image(getClass().getResourceAsStream("gui/logo-64.png")));

		// Configure stage
		stage.setMinWidth(500);
		stage.setTitle("对话机器人 " + VERSION + " (" + RELEASED + ")");
		stage.setScene(scene);
		stage.show();
	}

}
