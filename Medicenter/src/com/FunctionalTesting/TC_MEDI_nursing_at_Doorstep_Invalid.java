package com.FunctionalTesting;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.commonUtilities.ScreenShot;

public class TC_MEDI_nursing_at_Doorstep_Invalid {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[5]/a")
	WebElement Door_step;
	@FindBy(xpath=".//*[@id='top-menu']/li[5]/ul/li[1]/a")
	WebElement nursing;
	@FindBy(xpath=".//*[@id='loginreg1']/a")
	WebElement loginlink;
	@FindBy(xpath=".//*[@id='emailid1']")
	WebElement Email;
	@FindBy(xpath=".//*[@id='password']")
	WebElement pwd;
	@FindBy(xpath=".//*[@id='form_wrapper']/form[2]/div[3]/input")
	WebElement login;
	@FindBy(xpath=".//*[@id='fullname']")
	WebElement Fullname;
	@FindBy(xpath=".//*[@id='emaili']")
	WebElement email;
	@FindBy(xpath=".//*[@id='button2']")
	WebElement Gender;
	@FindBy(xpath=".//*[@id='regdiv']/input[5]")
	WebElement options;
	@FindBy(xpath=".//*[@id='age1']")
	WebElement age;
	@FindBy(xpath=".//*[@id='mobilenumber']")
	WebElement phonenum;
	@FindBy(xpath=".//*[@id='addre']")
	WebElement address;
	@FindBy(xpath=".//*[@id='pincode']")
	WebElement pincode;
	@FindBy(xpath=".//*[@id='regdiv']/input[11]")
	WebElement submit;
	public TC_MEDI_nursing_at_Doorstep_Invalid(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void nursingat(WebDriver driver) throws InterruptedException{
		org.openqa.selenium.interactions.Actions a=new Actions(driver);
		a.moveToElement(Door_step).build().perform();
		WebDriverWait w=new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.elementToBeClickable(nursing)).click();
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
		public void invaliddata (WebDriver driver) throws InterruptedException, IOException{
//			Data_Driven_design md=new Data_Driven_design();
//			String s1=md.getdata("Sheet1",1,3);
//			String s2=md.getdata("Sheet1",1,5);
//			String s3=md.getdata("Sheet1",1,3);
//			String s4=md.getdata("Sheet1",1,5);
//			String s5=md.getdata("Sheet1",1,3);
//			String s6=md.getdata("Sheet1",1,5);
			Thread.sleep(2000);
			Fullname.sendKeys("xxxxx");
			email.sendKeys("xxxxxxxxx@gmail.com");
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,100)","");
			Gender.click();
			
			options.click();
			age.sendKeys("00");
			phonenum.sendKeys("9999999999");
			address.sendKeys("xxxxxxxx");
			pincode.sendKeys("999999");
			ScreenShot.main(driver,"TC_MEDI_OTC_Healthcare");
//			submit.click();
			
			
			
		}
		
}
