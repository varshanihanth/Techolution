package com. bseindia.LoginPage;

import java.io.IOException;
import java.lang.reflect.Method;
import org.apache.log4j.Logger;
import org.testng.annotations.*;
import com. bseindia.testBase.TestBase;
import com. bseindia.uiActions.bseindiaui;
import com.relevantcodes.extentreports.LogStatus;


public class bseindiapoc extends TestBase
{
	bseindiaui ap;
public static final Logger log=Logger.getLogger(bseindiapoc.class.getName());
	
	@BeforeMethod
	  public void openbrowser(Method result) throws IOException
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
	  }

	@Test 
	public void bseindiaoperations() throws Exception 
	  { 
		  ap=new bseindiaui(driver);
		  Thread.sleep(3000);
		  log.info("<===========Starting bseindia operarions===========> ");
		  
		  ap.bseindiaoperations();
		  log.info("<===========Ended bseindia operations===========> ");
	  }
	
	@AfterMethod
	public void browserclose()
	{
		closeBrowser();
	}
	
}
