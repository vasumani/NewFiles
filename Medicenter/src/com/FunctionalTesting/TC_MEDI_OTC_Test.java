package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_OTC_Test {
	WebDriver driver;
	@Test
	public void OTC1() throws InterruptedException{
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		TC_MEDI_OTC OTC2=new TC_MEDI_OTC(driver);
		OTC2.Services(driver);
		OTC2.Ourdepartment(driver);
		OTC2.HowtoWork(driver);
		
	}

}
