package info.hb.chat.robot.demo;

import info.hb.chat.robot.cookie.LocalCookieAccess;
import info.hb.chat.robot.core.ChatRobotCore;

import java.io.IOException;
import java.net.URLEncoder;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

import zx.soft.utils.http.HttpClientDaoImpl;

public class ChatRobotDemo {

	/**
	 * 测试
	 */
	public static void main(String[] args) throws HttpException, IOException {

		ChatRobotCore chatRobotCore = new ChatRobotCore(new HttpClientDaoImpl(), new LocalCookieAccess());
		System.out.println(chatRobotCore.chat("我好帅", Boolean.TRUE));

	}

	public static void test() throws HttpException, IOException {
		String msg = URLEncoder.encode("我好帅", "UTF-8");
		HttpClient client = new HttpClient();
		HttpMethod method = new GetMethod(String.format("http://www.simsimi.com/requestChat?lc=ch&ft=1.0&req=%s", msg));
		method.setRequestHeader("Host", "www.simsimi.com");
		method.setRequestHeader("User-Agent",
				"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36");
		method.setRequestHeader("Accept", "application/json, text/javascript, */*; q=0.01");
		method.setRequestHeader("Accept-Language", "en-US,en;q=0.8");
		method.setRequestHeader("Accept-Encoding", "gzip,deflate,sdch");
		method.setRequestHeader("Content-Type", "application/json; charset=utf-8");
		method.setRequestHeader("X-Requested-With", "XMLHttpRequest");
		method.setRequestHeader("Referer", "http://www.simsimi.com/talk/Language?LC=ch");
		method.setRequestHeader("Connection", "keep-alive");
		method.setRequestHeader("DNT", "1");
		method.setRequestHeader("Cookie", "_gat=1");

		int status = client.executeMethod(method);
		System.out.println(status);
		System.out.println(method.getResponseBodyAsString());
	}

}
