package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_HeaderLink_Test_003 {
	WebDriver driver;
	@Test
	public void Header() throws InterruptedException{
		driver=CrossBrowser.Browser("Firefox");
		TC_MEDI_HeaderLink_003 HEAD=new TC_MEDI_HeaderLink_003(driver);
		HEAD.Headerlink(driver);
	}

}
