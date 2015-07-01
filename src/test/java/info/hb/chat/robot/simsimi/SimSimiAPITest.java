package info.hb.chat.robot.simsimi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimSimiAPITest {

	@Test
	public void testGetDefaultURL() {
		assertEquals("http://www.simsimi.com/requestChat?lc=ch&ft=1.0&req=hello", SimSimiAPI.getDefaultURL("hello"));
	}

	@Test
	public void testGetURL() {
		assertEquals("http://www.simsimi.com/requestChat?lc=ch&ft=1.0&req=hello", SimSimiAPI.getURL("ch", 1.0, "hello"));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetURL2() {
		assertEquals("http://www.simsimi.com/requestChat?lc=ch&ft=1.0&uid=123456789&req=hello",
				SimSimiAPI.getURL("ch", 1.0, 123456789L, "hello"));
	}

}
