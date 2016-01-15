package info.hb.chat.robot.cs;

import java.net.DatagramPacket;

public interface ServerRecieve extends ServerListener {

	public void recieve(DatagramPacket packet);

}
