package com.tools.steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.testng.Assert;

import com.jayway.restassured.response.Response;
import com.tools.apitools.ApiTools;

import cucumber.api.DataTable;
import cucumber.api.Delimiter;
import cucumber.api.Format;
import cucumber.api.Transpose;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;

public class ChineseDemo {

	private String action;

	private String subject;
	
	Response response = null;

	@假如("^当前是 \"([^\"]*)\"$")

	public void isChinese(String action) {

		this.action = action;

	}

	@当("^输入是 \"([^\"]*)\"$")

	public void input(String subject) {

		this.subject = subject;

	}

	@那么("^能看到 \"([^\"]*)\"$")

	public void outPut(String gretting) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(action + subject, gretting);

	}

	@假如("^给定了如下的动物:\"([^\"]*)\"$")
	public void 给定了如下的动物(@Delimiter(",") List<String> arg1) throws Throwable {
		if (null != arg1 && !arg1.isEmpty()) {
			System.out.println("list长度为:" + arg1.size());
			for (String str : arg1) {
				System.out.println(str);
			}
		}
	}

	@假如("^:给定了如下的word:$")
	public void 给定了如下的动物(DataTable words) throws Throwable {
		List<String> wordsList = words.asList(String.class);
		if (null != wordsList && !wordsList.isEmpty()) {
			System.out.println("list长度为:" + wordsList.size());
			for (String str : wordsList) {
				System.out.println("DataTable:" + str);
			}
		}
	}

	@假如("^:给定的日期为\"([^\"]*)\"$")
	public void 给定的日期为(@Format("yyyy-MM-dd'T'HH:mm:ss") Date date) throws Throwable {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
	}

	@假如("^给定的日期为: \"([^\"]*)\"$")
	public void 给定的日期为(@Format("yyyy-MM-dd'T'HH:mm:ss") Calendar cal) throws Throwable {
		cal.add(Calendar.YEAR, 1);
		System.out.println(cal.get(Calendar.YEAR));
	}

	@假如("^:给定的user信息如下$")
	public void 给定的user信息如下(@Transpose List<String> user) throws Throwable {
		for (String u : user) {
			System.out.println(u.toString());
		}
	}
	
	@当("^我发送一个请求 : \"(.*?)\"$")
	 public void postRequest(String apiPath) throws Throwable {
        response = ApiTools.post(apiPath);
    }
	
	@那么("^拿到返回结果 :$")
	public void getResult() {
		System.out.println("拿到返回结果 : "+response.getBody().print());
	}
}
