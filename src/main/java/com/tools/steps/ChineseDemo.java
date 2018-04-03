package com.tools.steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.testng.Assert;

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

		Assert.assertEquals(action + subject, gretting);

	}

	@假如("^:给定了如下的动物:\"([^\"]*)\"$")
	public void 给定了如下的动物(@Delimiter(",") List<String> arg1) throws Throwable {
		if (null != arg1 && !arg1.isEmpty()) {
			System.out.println("list长度为:" + arg1.size());
			for (String str : arg1) {
				System.out.println(str);
			}
		}
	}

	@假如("^:给定了如下的动物:$")
	public void 给定了如下的动物(DataTable animals) throws Throwable {
		List<String> animalsList = animals.asList(String.class);
		if (null != animalsList && !animalsList.isEmpty()) {
			System.out.println("list长度为:" + animalsList.size());
			for (String str : animalsList) {
				System.out.println("DataTable:" + str);
			}
		}
	}

	@假如("^:给定的日期为\"([^\"]*)\"$")
	public void 给定的日期为(@Format("yyyy-MM-dd'T'HH:mm:ss") Date date) throws Throwable {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
	}

	@假如("^:给定的日期为\"([^\"]*)\"$")
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
}
