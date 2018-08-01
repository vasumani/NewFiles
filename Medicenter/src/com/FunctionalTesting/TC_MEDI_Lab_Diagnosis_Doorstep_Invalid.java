package com.FunctionalTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_MEDI_Lab_Diagnosis_Doorstep_Invalid {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[5]/a")
	WebElement Door_step;
	@FindBy(xpath=".//*[@id='top-menu']/li[5]/ul/li[4]/a")
	WebElement Lab_diagnosis;
	@FindBy(xpath=".//*[@id='loginreg1']/a")
	WebElement loginlink;
	@FindBy(xpath=".//*[@id='emailid1']")
	WebElement Email;
	@FindBy(xpath=".//*[@id='password']")
	WebElement pwd;
	@FindBy(xpath=".//*[@id='form_wrapper']/form[2]/div[3]/input")
	WebElement login;
	@FindBy(xpath=".//*[@id='full_name']")
	WebElement Fullname;
	@FindBy(xpath=".//*[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@value='Female']")
	WebElement Gender;
	@FindBy(xpath=".//*[@id='age']")
	WebElement age;
	@FindBy(xpath=".//*[@id='phone_num']")
	WebElement phonenum;
	@FindBy(xpath=".//*[@id='regdiv']/select")
	WebElement Drop;
	@FindBy(xpath=".//*[@id='address']")
	WebElement address;
	@FindBy(xpath=".//*[@id='pincode']")
	WebElement pincode;
	@FindBy(xpath=".//*[@id='file']")
	WebElement File;
	@FindBy(xpath=".//*[@id='btnUpload']")
	WebElement submit;
	public TC_MEDI_Lab_Diagnosis_Doorstep_Invalid(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void lab(WebDriver driver){
		org.openqa.selenium.interactions.Actions a=new Actions(driver);
		a.moveToElement(Door_step).build().perform();
		WebDriverWait w=new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.elementToBeClickable(Lab_diagnosis)).click();
	}
	public void login(WebDriver driver) throws InterruptedException{
		loginlink.click();
//		Data_Driven_design md=new Data_Driven_design();
//		String s1=md.getdata("Sheet1",1,3);
//		String s2=md.getdata("Sheet1",1,5);
		
		Email.sendKeys("ramuboggavarapu.409@gmail.com");
		pwd.sendKeys("9618041895");
		login.click();
		Thread.sleep(1000);
		}
	public  void Register(WebDriver driver) throws InterruptedException, IOException, AWTException{
//		Data_Driven_design md=new Data_Driven_design();
//		String s1=md.getdata("Sheet1",1,3);
//		String s2=md.getdata("Sheet1",1,5);
//		String s3=md.getdata("Sheet1",1,3);
//		String s4=md.getdata("Sheet1",1,5);
//		String s5=md.getdata("Sheet1",1,3);
//		String s6=md.getdata("Sheet1",1,5);
		Thread.sleep(2000);
		Fullname.sendKeys("xxxx");
		email.sendKeys("xxxxxxx@gmail.com");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)","");
		Gender.click();
		age.sendKeys("xx");
		phonenum.sendKeys("xxxxxxxxxx");
		Select s=new Select(Drop);
		s.selectByValue("BP Test");
		address.sendKeys("xxxxxxxxxxxxxx");
		pincode.sendKeys("xxxxx");
		File.click();
		StringSelection n=new StringSelection("‪‪‪E:\\ramu.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(n, null);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		submit.click();
		
	}
	


}
