package myCucumber;

import org.testng.Assert;

import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;

public class ChineseDemo {

    private String action;

    private String subject;



    @假如("^当前是(.*)")

    public void isChinese(String action){

       this.action = action;

    }

    @当("^输入是(.*)")

    public void input(String subject){

        this.subject = subject;

    }

 

    @那么("^能看到(.*)")

    public void outPut(String gretting){

        Assert.assertEquals(action + subject, gretting);

    }

}
