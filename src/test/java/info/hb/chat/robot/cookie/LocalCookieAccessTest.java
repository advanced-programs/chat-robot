package info.hb.chat.robot.cookie;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LocalCookieAccessTest {

	private static LocalCookieAccess cookieAccess;

	@BeforeClass
	public static void setup() {
		cookieAccess = new LocalCookieAccess();
	}

	@Test
	public void testGetCookie() {
		assertEquals("_gat=1", cookieAccess.getCookie());
	}

	@Test
	public void testGetHeaders() {
		HashMap<String, String> headers = cookieAccess.getHeaders();
		assertEquals("www.simsimi.com", headers.get("Host"));
		assertEquals(
				"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36",
				headers.get("User-Agent"));
		assertEquals("application/json, text/javascript, */*; q=0.01", headers.get("Accept"));
		assertEquals("en-US,en;q=0.8", headers.get("Accept-Language"));
		assertEquals("gzip,deflate,sdch", headers.get("Accept-Encoding"));
		assertEquals("application/json; charset=utf-8", headers.get("Content-Type"));
		assertEquals("XMLHttpRequest", headers.get("X-Requested-With"));
		assertEquals("http://www.simsimi.com/talk/Language?LC=ch", headers.get("Referer"));
		assertEquals("keep-alive", headers.get("Connection"));
		assertEquals("1", headers.get("DNT"));
		assertEquals("_gat=1", headers.get("Cookie"));
	}

	@AfterClass
	public static void cleanup() {
		cookieAccess = null;
	}

}
