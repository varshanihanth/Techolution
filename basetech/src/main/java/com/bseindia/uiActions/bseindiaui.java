package com. bseindia.uiActions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com. bseindia.testBase.TestBase;

public class bseindiaui  extends TestBase
{
	WebDriver driver;
    public static final Logger log=Logger.getLogger(bseindiaui.class.getName());
    
    @FindBy(how = How.ID, using = "getquotesearch")
    WebElement bseid; //Web Element and id For search
    
    @FindBy(how = How.ID, using = "idcrval")
    WebElement todayvalue; //Web Element and id for value  
    
    
   
  

public bseindiaui(WebDriver driver)
{
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
}

public void bseindiaoperations() throws Exception
{
	  Thread.sleep(3000);
	  bseid.sendKeys("500820");
	  //Select suggestion 
      Thread.sleep(9000);
	  //Press enter button to select suggested option 
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  //get Stack value and colour code
	  Thread.sleep(5000);
	  String aptodayval = todayvalue.getText();
	  System.out.println("ASIAN PAINTS LTD today value is " +aptodayval);
	  String apcolor = todayvalue.getCssValue("color");
	  System.out.println("ASIAN PAINTS LTD today value color is " +apcolor);
	  
	  Thread.sleep(3000);
	  bseid.sendKeys("500290");
	  //Select suggestion 
      Thread.sleep(9000);
	  //Press enter button to select suggested option 
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  //get Stack value and colour code
	  Thread.sleep(5000);
	  String mrftodayval = todayvalue.getText();
	  System.out.println("MRF LTD today value is " +mrftodayval);
	  String mrfcolor = todayvalue.getCssValue("color");
	  System.out.println("MRF LTD today value color is " +mrfcolor);
		 
	  Thread.sleep(3000);
	  bseid.sendKeys("500325");
	  //Select suggestion 
      Thread.sleep(9000);
	  //Press enter button to select suggested option 
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  //get Stack value and colour code
	  Thread.sleep(5000);
	  String riltodayval = todayvalue.getText();
	  System.out.println("RELIANCE INDUSTRIES LTD. today value is " +riltodayval);
	  String rilcolor = todayvalue.getCssValue("color");
	  System.out.println("RELIANCE INDUSTRIES LTD. today value color is " +rilcolor);
	  
	  
}
}