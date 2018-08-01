package com.FunctionalTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_MEDI_OTC {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/a")
	WebElement Pharmacy;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/ul/li[5]/a")
	WebElement OTC;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[1]/div/h3/a")
	WebElement First_aid;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[2]/div/h3/a")
	WebElement Health_care ;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[3]/div/h3/a")
	WebElement Mens_care;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[4]/div/h3/a")
	WebElement Womens_care;
	@FindBy(xpath=".//*[@id='accordion']/div/div[1]/h4/a")
	List<WebElement> Our_Departments;
	@FindBy(xpath=".//*[@id='extraFeatures']/div/div/div[2]")
	List<WebElement> How_we_work;
	
	public TC_MEDI_OTC(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	public void Services(WebDriver driver) throws InterruptedException
			{
				Actions a=new Actions(driver);
				a.moveToElement(Pharmacy).build().perform();
				Thread.sleep(2000);
				OTC.click();
				Thread.sleep(2000);
				First_aid.click();
				driver.navigate().back();
				Thread.sleep(2000);
				Health_care.click();
				driver.navigate().back();
				Thread.sleep(2000);
				Mens_care.click();
				driver.navigate().back();
				Thread.sleep(2000);
				Womens_care.click();
				driver.navigate().back();
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("window.scroll(0, 1000)","");	
				
	        }
	public void Ourdepartment(WebDriver driver) throws InterruptedException
	{
		
		for(int i=0; i<Our_Departments.size(); i++)
		{
			System.out.println(Our_Departments.size());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Our_Departments.get(i).click();
			Thread.sleep(2000);
			
		}
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scroll(0, 1000)","");
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
	



