package com.FunctionalTesting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sun.awt.SunHints.Key;

public class TC_MEDI_PharmacyPage_018 {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[1]/a")
  WebElement Home;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/a")
	WebElement Pharmacy;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/ul/li[1]/a")
	WebElement Medicaldevice;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/ul/li[2]/a")
	WebElement Beautyproduct;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/ul/li[3]/a")
	WebElement Mother_Baby;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/ul/li[4]/a")
	WebElement Diabetes;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/ul/li[5]/a")
	WebElement OTC;
	
	public TC_MEDI_PharmacyPage_018(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void pharmacypage(WebDriver driver) throws InterruptedException{
		org.openqa.selenium.interactions.Actions a=new Actions(driver);
		a.moveToElement(Pharmacy).build().perform();
		
		WebDriverWait w=new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.elementToBeClickable(Medicaldevice)).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		a.contextClick(Pharmacy).sendKeys(Keys.ARROW_DOWN).build().perform();
		Beautyproduct.click();
		driver.navigate().back();
		a.contextClick(Pharmacy).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		Mother_Baby.click();
		driver.navigate().back();
		a.contextClick(Pharmacy).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		Diabetes.click();
		driver.navigate().back();
		a.contextClick(Pharmacy).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		OTC.click();
	}
}
