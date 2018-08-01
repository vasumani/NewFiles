package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_Getan_appointment_Test {
	WebDriver driver;
	@Test
	public void appoentm(){
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		TC_MEDI_Getan_appointment app=new TC_MEDI_Getan_appointment(driver);
		app.appointment();
		
	}

}
