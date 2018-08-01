package com.SmokeTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_Medi_Totallinks {
	WebDriver driver;
	@Test
	public void Totallinks(){
		driver=CrossBrowser.Browser("Firefox");
		List<WebElement> link=driver.findElements(By.tagName("li"));
		System.out.println("Totallinkssize:"+link.size());
		for(WebElement links:link){
			System.out.println(links.getText());
		}
	}

}
