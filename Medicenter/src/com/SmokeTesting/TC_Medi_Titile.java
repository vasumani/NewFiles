package com.SmokeTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.commonUtilities.CrossBrowser;

public class TC_Medi_Titile {
	
	WebDriver driver;
	@Test
	
	public  void title()
	{
	 driver=CrossBrowser.Browser("Firefox");
		String actual="Medicenter";
		String expect=driver.getTitle();
		if(actual.equals(expect)){
			System.out.println("Title is Verified");
		}else{
			System.out.println("Title is not verified");
		}
		driver.close();
	}
	

}
