package com.SmokeTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_Loginwith_ValidData_Test_006 {
	WebDriver driver;
	@Test
	public void register() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException{
		driver=CrossBrowser.Browser("Firefox");
		TC_MEDI_Loginwith_ValidData_006 log=new TC_MEDI_Loginwith_ValidData_006(driver);
		log.loginmain(driver);
}
}
