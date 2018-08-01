package com.SmokeTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_loginwith_Invalid_Data_Test_007 {
	WebDriver driver;
	@Test
	public void register() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException{
		driver=CrossBrowser.Browser("Firefox");
	
		TC_MEDI_loginwith_Invalid_Data_007 invalid=new TC_MEDI_loginwith_Invalid_Data_007(driver);
	
	invalid.invalidlogin(driver);
	
	}
}
