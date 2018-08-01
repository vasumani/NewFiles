package com.FunctionalTesting;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_Lab_Diagnosis_Doorstep_Invalid_Test {
	WebDriver driver;
	@Test
	public void labtset() throws InterruptedException, IOException, AWTException{
	driver=CrossBrowser.Browser("Firefox");
	driver.manage().window().maximize();
	TC_MEDI_Lab_Diagnosis_Doorstep_Invalid labtest=new TC_MEDI_Lab_Diagnosis_Doorstep_Invalid(driver);
	labtest.lab(driver);
	labtest.login(driver);
	labtest.lab(driver);
	labtest.Register(driver);
	}
}
