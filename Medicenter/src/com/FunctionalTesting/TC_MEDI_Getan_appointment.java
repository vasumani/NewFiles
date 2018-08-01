package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_MEDI_Getan_appointment {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[4]/a")
	WebElement Appoentment;
	public TC_MEDI_Getan_appointment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
public void appointment(){
	
Appoentment.click();
driver.close();
}
}
