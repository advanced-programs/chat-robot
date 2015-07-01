package info.hb.chat.robot.cookie;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import zx.soft.utils.config.ConfigUtil;

public class LocalCookieAccess implements CookiesAccess {

	private Properties props;

	public LocalCookieAccess() {
		this.props = ConfigUtil.getProps("Headers.properties");
	}

	@Override
	public String getCookie() {
		return props.getProperty("Cookie");
	}

	@Override
	public HashMap<String, String> getHeaders() {
		HashMap<String, String> headers = new HashMap<>();
		for (Entry<Object, Object> p : props.entrySet()) {
			headers.put(p.getKey().toString(), p.getValue().toString());
		}
		return headers;
	}

}
