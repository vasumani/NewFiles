package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_Beauty_Products_Test {

	WebDriver driver;
	@Test
public void Beautyyy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		driver=CrossBrowser.Browser("Firefox");
		TC_MEDI_Beauty_Products beaut=new TC_MEDI_Beauty_Products(driver);
		beaut.Beauty(driver);
		beaut.loginbuy(driver);
		beaut.Beauty1(driver);
	}
}
