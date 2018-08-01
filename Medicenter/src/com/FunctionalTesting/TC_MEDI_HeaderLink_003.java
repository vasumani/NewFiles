package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_MEDI_HeaderLink_003 {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[1]/a")
  WebElement Home;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/a")
	WebElement Pharmacy;
	@FindBy(xpath=".//*[@id='top-menu']/li[3]/a")
	WebElement Upload;
	@FindBy(xpath=".//*[@id='top-menu']/li[4]/a")
	WebElement Appoentment;
	@FindBy(xpath=".//*[@id='top-menu']/li[5]/a")
	WebElement Door_step;
	@FindBy(xpath=".//*[@id='top-menu']/li[6]/a")
	WebElement Contact;
	@FindBy(xpath=".//*[@id='loginreg1']/a")
	WebElement login;
	
	public TC_MEDI_HeaderLink_003(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void Headerlink(WebDriver driver) throws InterruptedException{


		Home.click();

		Thread.sleep(2000);
		Pharmacy.click();
//		driver.navigate().back();
		Upload.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Appoentment.click();
		driver.navigate().back();
		Door_step.click();
		driver.navigate().back();
		Contact.click();
		driver.navigate().back();
		login.click();
		driver.navigate().back();
		
		
	}
	
	
}
