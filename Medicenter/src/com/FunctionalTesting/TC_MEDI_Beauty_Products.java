package com.FunctionalTesting;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_MEDI_Beauty_Products {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/a")
	WebElement Pharmacy;
	@FindBy(xpath=".//*[@id='top-menu']/li[2]/ul/li[2]/a")
	WebElement Beauty;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[1]/div")
	List<WebElement> Categories;
	@FindBy(xpath=".//*[@id='service']/div/div/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div/div[3]/a[1]/input")
	WebElement buy;
	@FindBy(xpath=".//*[@id='emailid1']")
	WebElement Email;
	@FindBy(xpath=".//*[@id='password']")
	WebElement pwd;
	@FindBy(xpath=".//*[@id='form_wrapper']/form[2]/div[3]/input")
	WebElement login;
	@FindBy(xpath=".//*[@id='loginreg']/a/i")
	WebElement cart;
	@FindBy(xpath="//input[@name='qty_list']")
	WebElement quantity;
	@FindBy(xpath=".//*[@id='confirmbooking']/table[2]/tbody/tr[2]/td[5]/a/i")
	WebElement remove;
	@FindBy(xpath=".//*[@id='confirmbooking']/input")
	WebElement confirmbkg;
	@FindBy(xpath="//*[@*='userlogout']")
	WebElement logout;
	public TC_MEDI_Beauty_Products(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Beauty(WebDriver driver) throws InterruptedException{
		 org.openqa.selenium.interactions.Actions a=new Actions(driver);
		a.moveToElement(Pharmacy).build().perform();	
//		 a.contextClick(Pharmacy).sendKeys(Keys.ARROW_DOWN).build().perform();
		WebDriverWait w=new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.elementToBeClickable(Beauty)).click();
			Thread.sleep(2000);
			for(int i=0;i<Categories.size();i++)
			{
				Categories.get(i).click();
				Thread.sleep(2000);	
				System.out.println(i);
				driver.navigate().back();
				Thread.sleep(2000);
			}
	}
	 public void loginbuy(WebDriver driver) throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{
			buy.click();
			Thread.sleep(1000);
//			Data_Driven_design md=new Data_Driven_design();
//			String s1=md.getdata("Sheet1",1,3);
//	    	String s2=md.getdata("Sheet1",1,5);
	    	Email.sendKeys("ramuboggavarapu.409@gmail.com");
	    	pwd.sendKeys("9618041895");
	    	login.click();
	    	Thread.sleep(1000);
		}
	
	 public void Beauty1(WebDriver driver) throws InterruptedException
		{
		 buy.click();
			cart.click();
			Thread.sleep(1000);
			quantity.clear();
			quantity.sendKeys("3");
//			remove.click();
			Thread.sleep(1000);
			confirmbkg.click();
			Thread.sleep(1000);
			logout.click();
		}
	 
}
