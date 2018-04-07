package com.sunmi.dao;

import com.sunmi.model.PostModel;

import httpclicent.HttpClientUtil;

public class SunmiDao {
	public String Post(PostModel postModel){
		System.err.println(postModel.getMap().toString());
		return HttpClientUtil.sendHttpPosts(postModel.getUrl(), postModel.getMap());
	}
}
