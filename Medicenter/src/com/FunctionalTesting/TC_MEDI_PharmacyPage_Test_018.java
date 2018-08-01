package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_PharmacyPage_Test_018 {
	WebDriver driver;
	@Test
	public void pharmacy() throws InterruptedException{
		driver=CrossBrowser.Browser("Firefox");
		TC_MEDI_PharmacyPage_018 page=new TC_MEDI_PharmacyPage_018(driver);
		page.pharmacypage(driver);
	}

}
