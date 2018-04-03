package misun_web.Interface;

import java.util.Map;

import httpclicent.HttpClientUtil;

public class httpInterface {
	private String url = "";
	private Map<String, Object> map;
	public  httpInterface(String URL,Map<String, Object> MAP) {
		this.url = url + URL;
		System.err.println(url);
		this.map = MAP;
	}
	
	public String getResult() {
		System.err.println(map.toString());
		return HttpClientUtil.sendHttpPosts(url, map);
	}
}
