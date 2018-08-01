package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;


public class TC_MEDI_OTC_FirstAid_Test {
	WebDriver driver;
	@Test
	public void firstaidd() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		TC_MEDI_OTC_FirstAid aid=new TC_MEDI_OTC_FirstAid(driver);
		aid.firstaid(driver);
		aid.loginbuy(driver);
		aid.First(driver);
		driver.close();
		
				
	}

}
