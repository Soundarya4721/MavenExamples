package com.facebook.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebookPom.pages.LoginPageFb;

public class VerifyFacebookLogin {
	
	public WebDriver driver=null;
	public String Url="https://www.facebook.com";
	
	
	@BeforeTest
	public void verifyValidLogin() {
		
		//Initializing chrome driver
		//to disable notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ltatavarthy\\Documents\\chromedriver\\chromedriver.exe");
		
		 driver=new ChromeDriver(options);		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(Url);
		
		LoginPageFb lpf=new LoginPageFb(driver);
		
		lpf.EmailEnter();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		lpf.EnterPassword();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		lpf.ClickLoginButton();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
	
}
