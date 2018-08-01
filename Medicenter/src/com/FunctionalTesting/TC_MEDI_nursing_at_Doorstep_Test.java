package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_nursing_at_Doorstep_Test {
WebDriver driver;
@Test
public void doorstep() throws InterruptedException{
	driver=CrossBrowser.Browser("Firefox");
	driver.manage().window().maximize();
	TC_MEDI_nursing_at_Doorstep door=new TC_MEDI_nursing_at_Doorstep(driver);
	door.nursingat(driver);
	Thread.sleep(2000);
	door.login(driver);
	door.nursingat(driver);
	door.Register(driver);
}
}
