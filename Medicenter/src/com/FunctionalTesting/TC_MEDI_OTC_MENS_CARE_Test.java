package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_OTC_MENS_CARE_Test {

	WebDriver driver;
	@Test
	public void care() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		TC_MEDI_OTC_MENS_CARE men=new TC_MEDI_OTC_MENS_CARE(driver);
		men.Menscare(driver);
		men.loginbuy(driver);
		men.Menscare(driver);
		men.Mens(driver);
		
	}
}
