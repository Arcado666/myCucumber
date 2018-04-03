package misun_web.Interface;

import com.alibaba.fastjson.JSONObject;

public class responseInterface {
	String result ;
	public responseInterface(String Result) {
		this.result = Result;
	}
	
	public int getCode() {
		JSONObject jsonObject = JSONObject.parseObject(result);
		
		return jsonObject.getInteger("code");
	}
	public Object getData() {
		JSONObject jsonObject = JSONObject.parseObject(result);
		
		return jsonObject.get("data");
	}
	public String getMsg() {
		JSONObject jsonObject = JSONObject.parseObject(result);
		
		return jsonObject.getString("msg");
		
	}
	
	public static void main(String[] args) {
		String string = "{\"code\":1,\"data\":{\"count\":\"2\",\"result\":[{\"sId\":\"20572\",\"uId\":\"20572\",\"contactName\":\"\\u4f0d\\u6c38\\u7545\",\"shopName\":\"\\u53f0\\u57ce\\u5e38\\u65b0\\u996e\\u54c1\\u5e97\",\"createTime\":1511507930,\"shopAddress\":\"\\u53f0\\u5c71\\u5e02\\u821c\\u5fb7\\u8def133\\u53f7\\u91d1\\u8302\\u5e7f\\u573aE\\u5ea7\\u56db\\u5c424009\\u30014010\\u53f7\",\"furtherStatus\":4,\"mobile\":\"15994898298\",\"shopType\":\"\\u9910\\u996e\",\"shopLanguage\":\"Restaurant\"},{\"sId\":\"20449\",\"uId\":\"20449\",\"contactName\":\"\\u5a04\\u6653\",\"shopName\":\"\\u5176\\u5b9e\\u6211\\u662f\\u87ba\\u86f3\\u7c89\",\"createTime\":1511346102,\"shopAddress\":\"\\u9752\\u53e3\\u9547\\u4e1c\\u5173\\u8def98-18\\u53f7\\uff08\\u8001\\u767e\\u59d3\\u5927\\u836f\\u623f\\u5317\\u7b2c\\u4e8c\\u5bb6\\uff09\",\"furtherStatus\":4,\"mobile\":\"15366658110\",\"shopType\":\"\\u9910\\u996e\",\"shopLanguage\":\"Restaurant\"}]},\"msg\":\"\"}";
		System.out.println(new responseInterface(string).getCode());
		System.out.println(new responseInterface(string).getData());
		System.out.println(new responseInterface(string).getMsg());
		
	}
}
