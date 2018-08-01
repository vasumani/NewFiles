package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_OTC_Healthcare_Test {
	WebDriver driver;
	@Test
	public void care() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		TC_MEDI_OTC_Healthcare main=new TC_MEDI_OTC_Healthcare(driver);
		main.Healthcare(driver);
		main.loginbuy(driver);
		main.Healthcare(driver);
		main.Health(driver);
		main.screen(driver);
	}
}
