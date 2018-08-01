package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_HomePage_Test_002 {
	WebDriver driver;
	@Test
	public void Home() throws InterruptedException{
		driver=CrossBrowser.Browser("Firefox");
		TC_MEDI_HomePage_002 Home1=new TC_MEDI_HomePage_002(driver);
		Home1.Homepage(driver);
	}

}
