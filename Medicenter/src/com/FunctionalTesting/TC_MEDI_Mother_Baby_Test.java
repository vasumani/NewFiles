package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_Mother_Baby_Test {
	WebDriver driver;
	@Test
	public void Motherandbaby(){
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		TC_MEDI_Mother_Baby Mother=new TC_MEDI_Mother_Baby(driver);
		Mother.Mother_Baby(driver);
	}

}
