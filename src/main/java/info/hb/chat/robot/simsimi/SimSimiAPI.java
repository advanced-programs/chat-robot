package info.hb.chat.robot.simsimi;

/**
 * 韩国SimSimi接口
 * http://www.simsimi.com
 * http://developer.simsimi.com/api?lang=zh_CN
 *
 * @author wanggang
 *
 */
public class SimSimiAPI {

	private static final String BASE_URL = "http://www.simsimi.com/requestChat?";

	// 语言，默认是ch
	private static final String LC = "lc";

	// 拟合度，范围：0-1.0，默认是1.0
	private static final String FT = "ft";

	// 请求字符串，也就是发送的对话内容
	private static final String REQ = "req";

	// 用户ID，可以不用
	@Deprecated
	private static final String UID = "uid";

	public static String getDefaultURL(String msg) {
		return getURL("ch", 1.0, msg);
	}

	public static String getURL(String lc, double ft, String msg) {
		return BASE_URL + LC + "=" + lc + "&" + FT + "=" + ft + "&" + REQ + "=" + msg;
	}

	@Deprecated
	public static String getURL(String lc, double ft, long uid, String msg) {
		return BASE_URL + LC + "=" + lc + "&" + FT + "=" + ft + "&" + UID + "=" + uid + "&" + REQ + "=" + msg;
	}

}
