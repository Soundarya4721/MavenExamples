package com.facebook.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.facebookPom.pages.HandlingAlerts;

public class VerifyAlertclass {
	WebDriver driver=null;

	HandlingAlerts Haa=new HandlingAlerts(driver);
	String Url="https://www.apsrtconline.in/oprs-web/";
	
	@Test
	public void TestAlert() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ltatavarthy\\Documents\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver(options);
		driver.navigate().to(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Haa.clickSearch(driver);
		driver.close();
	}
}
