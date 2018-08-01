package com.SmokeTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_ForgetPasswordPageWith_InvalidData_Test_011 {
	WebDriver driver;
	@Test
	public void Forgotpwd() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException{
		driver=CrossBrowser.Browser("Firefox");
	
	TC_MEDI_ForgetPasswordPageWith_InvalidData_011 pwd=new TC_MEDI_ForgetPasswordPageWith_InvalidData_011(driver);
	pwd.Forgotpassword();
	
	
	}
	



}
