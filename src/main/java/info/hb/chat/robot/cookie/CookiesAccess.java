package info.hb.chat.robot.cookie;

import java.util.HashMap;

/**
 * Cookie获取接口
 *
 * @author wanggang
 *
 */
public interface CookiesAccess {

	public String getCookie();

	public HashMap<String, String> getHeaders();

}
