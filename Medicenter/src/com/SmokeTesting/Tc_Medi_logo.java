package com.SmokeTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class Tc_Medi_logo {
	@Test
public  void logo(){
WebDriver driver=CrossBrowser.Browser("Firefox");
	WebElement logom=driver.findElement(By.xpath(".//*[@id='header']/div/nav/div/div[1]/a"));
	if(logom.isDisplayed()){
		System.out.println("logo is displayed");
	}else{
		System.out.println("logo is not displayed");
	}
driver.close();	
}

}
