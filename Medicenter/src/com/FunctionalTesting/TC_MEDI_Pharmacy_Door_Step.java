package com.FunctionalTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_MEDI_Pharmacy_Door_Step {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[5]/a")
	WebElement Door_step;
	@FindBy(xpath=".//*[@id='top-menu']/li[5]/ul/li[2]/a")
	WebElement pharmacy;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[1]/div/h3/a")
	WebElement MotherandBaby;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[2]/div/h3/a")
	WebElement nursing;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[3]/div/h3/a")
	WebElement Diabetes;
	@FindBy(xpath="//a[text()='OTC']")
	WebElement OTC;
	@FindBy(xpath="//div[@class='panel-group custom-panel']")
	List<WebElement> Our_Departments;
	@FindBy(xpath=".//*[@id='extraFeatures']/div/div/div[2]")
	List<WebElement> How_we_work;
	public TC_MEDI_Pharmacy_Door_Step(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void pharmacy(WebDriver driver) throws InterruptedException{
	
		org.openqa.selenium.interactions.Actions a=new Actions(driver);
		a.moveToElement(Door_step).build().perform();
		WebDriverWait w=new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.elementToBeClickable(pharmacy)).click();
		
		MotherandBaby.click();
		driver.navigate().back();
		nursing.click();
		driver.navigate().back();
		Diabetes.click();
		driver.navigate().back();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scroll(0, 10)","");
	Thread.sleep(2000);
		OTC.click();
		driver.navigate().back();
	}
	
	
		public void Ourdepartment(WebDriver driver) throws InterruptedException
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scroll(0, 100)","");
	Thread.sleep(2000);
			for(int i=0; i<Our_Departments.size(); i++)
			{
				System.out.println(Our_Departments.size());
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Our_Departments.get(i).click();
				Thread.sleep(2000);
				
			}
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("window.scroll(0, 1000)","");
		}
		
		public void HowtoWork(WebDriver driver)
		{
			for(int i=0;i<How_we_work.size();i++)
			{
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				How_we_work.get(i).click();
			}
			driver.close();
		}
	}


