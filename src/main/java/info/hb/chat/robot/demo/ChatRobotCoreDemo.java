package info.hb.chat.robot.demo;

import info.hb.chat.robot.cookie.LocalCookieAccess;
import info.hb.chat.robot.core.ChatRobotCore;
import zx.soft.utils.http.HttpClientDaoImpl;

/**
 * 聊天机器人核心类实现示例
 *
 * @author wanggang
 *
 */
public class ChatRobotCoreDemo {

	public static void main(String[] args) {
		ChatRobotCore chatRobotCore = new ChatRobotCore(new HttpClientDaoImpl(),
				new LocalCookieAccess());
		System.out.println(chatRobotCore.chat("我好帅", Boolean.TRUE));
	}

}
