package com.FunctionalTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_MEDI_HomePage_002 {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[1]/a")
	WebElement Home;
	@FindBy(xpath="//button[text()='Next']")
	WebElement Next;
	@FindBy(xpath="//a[text()='readmore_area']")
	WebElement Emergency;
	@FindBy(xpath=".//*[@id='app1']")
	WebElement Appointment;
	@FindBy(xpath="//a[text()='Physiotherapy']")
	WebElement Physiotherapy;
	@FindBy(xpath="//a[text()='Lab Tests']")
	WebElement LabTests;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[3]/div/h3")
	WebElement Health_Care;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[4]/div/h3")
	WebElement Medical_Devices;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[5]/div/h3")
	WebElement Special_Doctor;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[6]/div/h3")
	WebElement Hours_Service;
	public TC_MEDI_HomePage_002(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Homepage(WebDriver driver) throws InterruptedException{
		

		Home.click();
		Next.click();
		Thread.sleep(1000);
		Next.click();
		Thread.sleep(1000);
		Next.click();
		Thread.sleep(1000);
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("window.scroll(0,1)","");
	
//	WebDriverWait w=new WebDriverWait(driver, 50);
//	w.until(ExpectedConditions.elementToBeClickable(Physiotherapy)).click();
//Emergency.click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		Appointment.click();
//		Thread.sleep(1000);
//		driver.navigate().back();

		Physiotherapy.click();
		Thread.sleep(2000);
		driver.navigate().back();
		LabTests.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Health_Care.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Medical_Devices.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Special_Doctor.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		
		
		
	}
	
	

}
