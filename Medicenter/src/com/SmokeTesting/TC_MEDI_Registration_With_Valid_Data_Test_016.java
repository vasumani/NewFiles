package com.SmokeTesting;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_Registration_With_Valid_Data_Test_016 {
	WebDriver driver;
	@Test
	public void register() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException{
		driver=CrossBrowser.Browser("Firefox");
		TC_MEDI_Registration_With_Valid_Data_016 Reg=new TC_MEDI_Registration_With_Valid_Data_016(driver);
		Reg.Registration(driver);
		
		
	}

}
