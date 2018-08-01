package com.FunctionalTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_nursing_at_Doorstep_Invalid_Test {
	
		WebDriver driver;
		@Test
		public void doorstep() throws InterruptedException, IOException{
			driver=CrossBrowser.Browser("Firefox");
		
			driver.manage().window().maximize();
		TC_MEDI_nursing_at_Doorstep_Invalid inval=new TC_MEDI_nursing_at_Doorstep_Invalid(driver);
		inval.nursingat(driver);
		inval.login(driver);
		inval.nursingat(driver);
		inval.invaliddata(driver);
		
		
		
		
		}
		
			
}
