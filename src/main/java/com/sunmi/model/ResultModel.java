package com.sunmi.model;

import com.alibaba.fastjson.JSONObject;

public class ResultModel {
	String result ;
	public ResultModel(String Result) {
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
}
