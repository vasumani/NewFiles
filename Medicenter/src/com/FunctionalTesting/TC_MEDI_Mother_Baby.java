package com.FunctionalTesting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_MEDI_Mother_Baby {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/a")
	WebElement Pharmacy;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/ul/li[3]/a")
	WebElement Mother_Baby;
	 public TC_MEDI_Mother_Baby(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		public void Mother_Baby(WebDriver driver){
			org.openqa.selenium.interactions.Actions a=new Actions(driver);
			a.moveToElement(Pharmacy).build().perform();
			WebDriverWait w=new WebDriverWait(driver, 50);
			w.until(ExpectedConditions.elementToBeClickable(Mother_Baby)).click();
			driver.close();
		}
	

}
