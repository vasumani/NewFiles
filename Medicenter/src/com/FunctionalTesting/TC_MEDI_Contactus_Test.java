package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_Contactus_Test {
	WebDriver driver;
	@Test
	public void contactus(){
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		TC_MEDI_Contactus contactus1=new TC_MEDI_Contactus(driver);
		contactus1.contact();
			
		
	}

}
