package com.SmokeTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonUtilities.Data_Driven_design;

public class TC_MEDI_Loginwith_ValidData_006 {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='loginreg1']/a")
	WebElement reglink;
	@FindBy(xpath=".//*[@id='emailid1']")
	WebElement email;
	@FindBy(xpath=".//*[@id='password']")
	WebElement password;
	@FindBy(xpath=".//*[@id='form_wrapper']/form[2]/div[3]/input")
	WebElement login;
	public TC_MEDI_Loginwith_ValidData_006(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	public void loginmain(WebDriver driver) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		
		reglink.click();
		Thread.sleep(2000);
		
		Data_Driven_design g=new Data_Driven_design();
		String EMAIL=g.getdata("Sheet1",1,0);
		String pwd=g.getdata("Sheet1",1,1);
		email.sendKeys(EMAIL);
		password.sendKeys(pwd);
		login.click();
		
	}

}
