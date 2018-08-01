package com.commonUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	WebDriver driver;
	
	public static void main(WebDriver driver,String String) throws IOException{
//		WebDriver driver=CrossBrowser.Browser("Firefox");
		TakesScreenshot s=(TakesScreenshot)driver;
		File Source=s.getScreenshotAs(OutputType.FILE);
		File destination=new File("./screenshot/"+"Nursing invalid"+".png");
		FileUtils.copyFile(Source, destination);
	}

	
	

	

}
