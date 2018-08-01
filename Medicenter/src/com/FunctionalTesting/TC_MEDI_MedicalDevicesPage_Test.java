package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_MedicalDevicesPage_Test {
	WebDriver driver;
	@Test
	public void medicalmain() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		driver=CrossBrowser.Browser("Firefox");
		TC_MEDI_MedicalDevicesPage MEDI=new TC_MEDI_MedicalDevicesPage(driver);
		MEDI.MedicalDevice(driver);
		MEDI.loginbuy(driver);
		MEDI.MedicalDevice(driver);
		MEDI.Medical(driver);
		
		
		
	}

}
