package info.hb.chat.robot.core;

import info.hb.chat.robot.cookie.CookiesAccess;
import info.hb.chat.robot.simsimi.SimSimiAPI;

import org.codehaus.jackson.JsonNode;

import zx.soft.utils.codec.URLCodecUtils;
import zx.soft.utils.http.ClientDao;
import zx.soft.utils.json.JsonNodeUtils;

/**
 * 聊天机器人核心类
 *
 * @author wanggang
 *
 */
public class ChatRobotCore {

	private ClientDao clientDao;

	private CookiesAccess cookieAccess;

	public ChatRobotCore(ClientDao clientDao, CookiesAccess cookieAccess) {
		super();
		this.clientDao = clientDao;
		this.cookieAccess = cookieAccess;
	}

	public String chat(String sentence, boolean isFullHeaders) {
		String response = null;
		if (isFullHeaders) {
			response = clientDao.doGet(getURL(sentence), cookieAccess.getHeaders(), "UTF-8");
		} else {
			response = clientDao.doGet(getURL(sentence), cookieAccess.getCookie(), "UTF-8");
		}
		JsonNode node = JsonNodeUtils.getJsonNode(response);
		response = node.get("res").toString();
		return response.substring(1, response.length() - 1);
	}

	private String getURL(String msg) {
		return SimSimiAPI.getDefaultURL(URLCodecUtils.encoder(msg, "UTF-8"));
	}

}
