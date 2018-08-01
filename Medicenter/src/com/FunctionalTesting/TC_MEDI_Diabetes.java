package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_MEDI_Diabetes {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/a")
	WebElement Pharmacy;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/ul/li[4]/a")
	WebElement Diabetes;
	  public TC_MEDI_Diabetes(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
			public void Diabetes(WebDriver driver){
				org.openqa.selenium.interactions.Actions a=new Actions(driver);
				a.moveToElement(Pharmacy).build().perform();
				WebDriverWait w=new WebDriverWait(driver, 50);
				w.until(ExpectedConditions.elementToBeClickable(Diabetes)).click();
				driver.close();
			}

}
