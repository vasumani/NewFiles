package com.FunctionalTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_PhysioTherapy_Invalid_Test {

	WebDriver driver;
	@Test
	public void main() throws InterruptedException, IOException{
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		TC_MEDI_PhysioTherapy_Invalid phy=new TC_MEDI_PhysioTherapy_Invalid(driver);
		phy.physo(driver);
		phy.login(driver);
		phy.physo(driver);
		phy.register(driver);
}
}