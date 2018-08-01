package com.FunctionalTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonUtilities.Data_Driven_design;

public class TC_MEDI_UploadPrescription {
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='top-menu']/li[3]/a")
	WebElement Upload;
	@FindBy(xpath=".//*[@id='loginreg1']/a")
	WebElement loginlink;
	@FindBy(xpath=".//*[@id='emailid1']")
	WebElement Email;
	@FindBy(xpath=".//*[@id='password']")
	WebElement pwd;
	@FindBy(xpath=".//*[@id='form_wrapper']/form[2]/div[3]/input")
	WebElement login;
	@FindBy(xpath="//input[@id='file']")
	WebElement Browser;
	@FindBy(xpath=".//*[@id='btnUpload']")
	WebElement uploadF;
	@FindBy(xpath="//*[@*='userlogout']")
	WebElement logout;
	public TC_MEDI_UploadPrescription(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Upload(WebDriver driver) throws IOException, InterruptedException, AWTException{
		
	Upload.click();
	
	Browser.click();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	Runtime.getRuntime().exec("‪‪E:\\autoit.exe");
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
	
	uploadF.click();
	Thread.sleep(1000);
	logout.click();
	
		
	}
	public void login(WebDriver driver) throws InterruptedException{
		Upload.click();
		loginlink.click();
//		Data_Driven_design md=new Data_Driven_design();
//		String s1=md.getdata("Sheet1",1,3);
//		String s2=md.getdata("Sheet1",1,5);
		
		Email.sendKeys("ramuboggavarapu.409@gmail.com");
		pwd.sendKeys("9618041895");
		login.click();
		Thread.sleep(1000);
	}

}
