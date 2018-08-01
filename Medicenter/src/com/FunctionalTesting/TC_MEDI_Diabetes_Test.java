package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_Diabetes_Test {
	WebDriver driver;
	@Test
	public void Diabetes1(){
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		TC_MEDI_Diabetes Dia=new TC_MEDI_Diabetes(driver);
		Dia.Diabetes(driver);
	}
}
