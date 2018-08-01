package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_Pharmacy_Door_Step_Test {
	WebDriver driver;
	@Test
	public void Door() throws InterruptedException{
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		TC_MEDI_Pharmacy_Door_Step main=new TC_MEDI_Pharmacy_Door_Step(driver);
		main.pharmacy(driver);
		main.Ourdepartment(driver);
		main.HowtoWork(driver);
	}

}
