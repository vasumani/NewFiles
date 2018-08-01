package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_PhysioTherapy_Test {
	WebDriver driver;
	@Test
	public void main() throws InterruptedException{
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		TC_MEDI_PhysioTherapy phy=new TC_MEDI_PhysioTherapy(driver);
		phy.physo(driver);
		phy.login(driver);
		phy.physo(driver);
		phy.register(driver);
	}

}
