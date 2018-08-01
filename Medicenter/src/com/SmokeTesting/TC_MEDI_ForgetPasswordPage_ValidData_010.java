package com.SmokeTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonUtilities.Data_Driven_design;

public class TC_MEDI_ForgetPasswordPage_ValidData_010 {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='loginreg1']/a")
	WebElement reglink;
	@FindBy(xpath="//a[@class='forgot linkform']")
	WebElement Forgot;
	@FindBy(xpath=".//*[@id='form_wrapper']/form[3]/div[1]/input")
	WebElement email;
	@FindBy(xpath=".//*[@id='form_wrapper']/form[3]/div[2]/input")
	WebElement send;
	public TC_MEDI_ForgetPasswordPage_ValidData_010(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Forgotpassword(WebDriver driver) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		reglink.click();
		Thread.sleep(2000);
		Forgot.click();
//		Data_Driven_design g=new Data_Driven_design();
//		String Email=g.getdata("Sheet1", 1, 1);
		email.sendKeys("ramuboggavarapu.409@gmail.com");
		send.click();
		
		
	}
	

}
