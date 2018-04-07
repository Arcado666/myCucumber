package misun_web.Interface;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BasicsCase {

	static long Testtime;
	static long MethodTime;
	
	@BeforeTest
	public void beforeClass(){
		Testtime = System.currentTimeMillis();
	}
	
	@AfterTest
	public void afterClass(){
		Testtime = System.currentTimeMillis() - Testtime;
		System.err.println(Testtime);
	}
	
  @BeforeMethod
  public void beforeMethod(){
	  MethodTime = System.currentTimeMillis();
  }
  @AfterMethod
  public void afterMethod(){
	  MethodTime = System.currentTimeMillis() - MethodTime;
	  System.err.println(MethodTime);
  }

}
