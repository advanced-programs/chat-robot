package info.hb.chat.robot.cs;

import java.io.IOException;

public interface ServerError extends ServerListener {

	public void error(IOException ex);

}
