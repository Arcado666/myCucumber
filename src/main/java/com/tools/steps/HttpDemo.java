package com.tools.steps;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.tools.apitools.Testplay;

import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import misun_web.Interface.responseInterface;

public class HttpDemo{
	
	private String  result;
	
	
	@当("^我发送一个请求 : \"([^\"]*)\" 参数为$")
	public void postRequest(String url,String json) throws Throwable {
        JSONObject jObject = JSONObject.parseObject(json);
        Map<String , Object> map = jObject.getInnerMap();
        result = new Testplay(url, map).getResult();
    }
	@那么 ("^拿到的返回结果为:$" )
	public void getResults() {
		responseInterface rsi = new responseInterface(result);
		System.out.println(rsi.getMsg());
	}
}
