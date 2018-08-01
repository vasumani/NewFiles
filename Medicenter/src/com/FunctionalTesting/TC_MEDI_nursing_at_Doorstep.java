package com.FunctionalTesting;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_MEDI_nursing_at_Doorstep {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='top-menu']/li[5]/a")
	WebElement Door_step;
	@FindBy(xpath=".//*[@id='top-menu']/li[5]/ul/li[1]/a")
	WebElement nursing;
	@FindBy(xpath=".//*[@id='loginreg1']/a")
	WebElement loginlink;
	@FindBy(xpath=".//*[@id='emailid1']")
	WebElement Email;
	@FindBy(xpath=".//*[@id='password']")
	WebElement pwd;
	@FindBy(xpath=".//*[@id='form_wrapper']/form[2]/div[3]/input")
	WebElement login;
	@FindBy(xpath=".//*[@id='fullname']")
	WebElement Fullname;
	@FindBy(xpath=".//*[@id='emaili']")
	WebElement email;
	@FindBy(xpath="//input[@name='gender']")
	List<WebElement> Gender;
	@FindBy(xpath="//input[@value='Male']")
	WebElement male;
	@FindBy(xpath="//input[@value='Female Nurse']")
	WebElement Female_Nurse;
	@FindBy(xpath="//input[@name='nurse_req']")
	List<WebElement> options;
	@FindBy(xpath=".//*[@id='age1']")
	WebElement age;
	@FindBy(xpath=".//*[@id='mobilenumber']")
	WebElement phonenum;
	@FindBy(xpath=".//*[@id='addre']")
	WebElement address;
	@FindBy(xpath=".//*[@id='pincode']")
	WebElement pincode;
	@FindBy(xpath=".//*[@id='regdiv']/input[11]")
	WebElement submit;
	public TC_MEDI_nursing_at_Doorstep(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void nursingat(WebDriver driver) throws InterruptedException{
		org.openqa.selenium.interactions.Actions a=new Actions(driver);
		a.moveToElement(Door_step).build().perform();
		WebDriverWait w=new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.elementToBeClickable(nursing)).click();
	}
		public void login(WebDriver driver) throws InterruptedException{
		loginlink.click();
//		Data_Driven_design md=new Data_Driven_design();
//		String s1=md.getdata("Sheet1",1,3);
//		String s2=md.getdata("Sheet1",1,5);
		
		Email.sendKeys("ramuboggavarapu.409@gmail.com");
		pwd.sendKeys("9618041895");
		login.click();
		Thread.sleep(1000);
		}
		public void Register(WebDriver driver) throws InterruptedException{
//			Data_Driven_design md=new Data_Driven_design();
//			String s1=md.getdata("Sheet1",1,3);
//			String s2=md.getdata("Sheet1",1,5);
//			String s3=md.getdata("Sheet1",1,3);
//			String s4=md.getdata("Sheet1",1,5);
//			String s5=md.getdata("Sheet1",1,3);
//			String s6=md.getdata("Sheet1",1,5);
			Thread.sleep(2000);
			Fullname.sendKeys("Ramu");
			email.sendKeys("ramuboggavarapu.409@gmail.com");
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,100)","");
			male.click();
			Female_Nurse.click();
			
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("window.scrollBy(0,300)");
//			for(int i=0;i<Gender.size();i++){
//				Gender.get(i).click();
//			}
//			Thread.sleep(2000);
//			for(int j=0;j<options.size();j++){
//				options.get(j).click();
//			}
//			
			age.sendKeys("24");
			phonenum.sendKeys("8885259409");
			address.sendKeys("marathahalli");
			pincode.sendKeys("522316");
			submit.click();
			
			
			
		}
		
		
	

}
