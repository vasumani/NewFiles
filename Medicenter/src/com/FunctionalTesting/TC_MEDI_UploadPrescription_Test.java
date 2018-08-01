package com.FunctionalTesting;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_UploadPrescription_Test {
	WebDriver driver;
	@Test
	public void  uploadpres() throws IOException, InterruptedException, AWTException{
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		TC_MEDI_UploadPrescription up=new TC_MEDI_UploadPrescription(driver);
		up.login(driver);
		up.Upload(driver);
	}

}
