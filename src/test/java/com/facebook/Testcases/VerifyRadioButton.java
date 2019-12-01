package com.facebook.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.facebookPom.pages.HandlingRadioButtons;

public class VerifyRadioButton {
	
	WebDriver driver=null;
    String Url="https://www.facebook.com";

	@Test
public void verifyRadioButton() {
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ltatavarthy\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get(Url);
		HandlingRadioButtons Radio=new HandlingRadioButtons(driver);
		Radio.RadioButton(driver);
		driver.close();
	
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
