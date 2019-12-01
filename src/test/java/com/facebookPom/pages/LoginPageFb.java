package com.facebookPom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This class talks about Facebook login page

public class LoginPageFb {

	public static WebDriver driver;
	
	 By FrameDiv=By.xpath("//div[@id='blueBarDOMInspector']");
	 By EmailPhn=FrameDiv.xpath(".//input[@name='email']");
	 By password=FrameDiv.xpath(".//input[@name='pass']");
	 By loginButton=FrameDiv.xpath(".//input[@type='submit']");
	
	//parameters
	 String EmailId="sasidharkonduri92@gmail.com";
	 String Fbpassword="Sasidhar@4721";
	 
	 
	 //Parameterized Constructor
	public LoginPageFb(WebDriver driver) {
		
		LoginPageFb.driver=driver;
		
	}
	
	//methods for login page
	public void EmailEnter() {
		//Element visibility
		
		boolean values=driver.findElement(EmailPhn).isEnabled();
		
		if(values=true) {
		driver.findElement(EmailPhn).sendKeys(EmailId);
		}
	}
	
	//method to enter password
	public void EnterPassword() {
		
		boolean values=driver.findElement(password).isEnabled();
		System.out.println(values);
		
		if(values=true) {
		driver.findElement(password).sendKeys(Fbpassword);
		}
	
	}
	
//Method to click on login button
public void ClickLoginButton() {
		
		boolean values=driver.findElement(loginButton).isEnabled();
		System.out.println(values);
		
		if(values=true) {
		driver.findElement(loginButton).click();
		}
	
	}
	
	
	
	
}
