package com.SmokeTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonUtilities.Data_Driven_design;

public class TC_MEDI_Registration_With_Valid_Data_016 {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='loginreg1']/a")
	WebElement reglink;
	@FindBy(xpath=".//*[@id='form_wrapper']/form[2]/div[3]/a")
	WebElement regclick;
	@FindBy(xpath=".//*[@id='firstname']")
	WebElement firstname;
	@FindBy(xpath=".//*[@id='lastname']")
	WebElement lastname;
	@FindBy(xpath=".//*[@id='mobilenumber']")
	WebElement Mobile_number;
	@FindBy(xpath=".//*[@id='regemaili']")
	WebElement Email;
	@FindBy(xpath=".//*[@id='addre']")
	WebElement Address;
	@FindBy(xpath=".//*[@id='Password']")
	WebElement password;
	@FindBy(xpath=".//*[@id='retypepassword']")
	WebElement Retype_password;
	@FindBy(xpath=".//*[@id='file']")
	WebElement upload;
	@FindBy(xpath=".//*[@id='Myform']/div[9]/input")
	WebElement register;
	public TC_MEDI_Registration_With_Valid_Data_016(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
public void Registration(WebDriver driver) throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException{
	
	Thread.sleep(2000);
	reglink.click();
	Thread.sleep(2000);
	regclick.click();
	
	
	Data_Driven_design g=new Data_Driven_design();
	String fn=g.getdata("Sheet1",1,0);
	String ln=g.getdata("Sheet1",1,1);
	String Mobile=g.getdata("Sheet1",1,2);
	String Emai=g.getdata("Sheet1",1,3);
	String Address1=g.getdata("Sheet1",1,4);
	String Password1=g.getdata("Sheet1",1,5);
	String Retypepass1=g.getdata("Sheet1",1,6);
	
	
	firstname.sendKeys(fn);
	lastname.sendKeys(ln);
	Mobile_number.sendKeys(Mobile);
	Email.sendKeys(Emai);
	Address.sendKeys(Address1);
	password.sendKeys(Password1);
	Retype_password.sendKeys(Retypepass1);
	upload.click();
//	Runtime.getRuntime().exec("‪C:/Users/B.RAMU/Desktop/autoit.exe");
	StringSelection s=new StringSelection("‪E:\\VLS_2843 copy.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	register.click();
	
	
	
}
	
}
