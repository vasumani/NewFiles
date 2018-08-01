package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_MEDI_Contactus {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[6]/a")
	WebElement Contact;
	public TC_MEDI_Contactus(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void contact(){
Contact.click();
driver.close();
	}

}
