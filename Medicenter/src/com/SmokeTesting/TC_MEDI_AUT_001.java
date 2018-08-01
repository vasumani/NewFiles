package com.SmokeTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.commonUtilities.CrossBrowser;

public class TC_MEDI_AUT_001 {
	WebDriver d;
	@Test
	public void aut(){
		d=CrossBrowser.Browser("Firefox");
		d.close();
	}

}
