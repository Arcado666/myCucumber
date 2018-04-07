package com.sunmi.service;

import com.sunmi.dao.SunmiDao;
import com.sunmi.model.PostModel;
import com.sunmi.model.ResultModel;

public class SunmiTestService {
	SunmiDao sunmiDao;
	String result;
	public SunmiDao getSunmiDao() {
		return sunmiDao;
	}

	public void setSunmiDao(SunmiDao sunmiDao) {
		this.sunmiDao = sunmiDao;
	}
	public String executeRequest(PostModel postModel){
		this.result = this.sunmiDao.Post(postModel);
		return result;
	}
	
	public ResultModel getResult(){
		return new ResultModel(result);
	}
}
