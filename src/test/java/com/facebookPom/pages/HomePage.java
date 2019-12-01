package com.facebookPom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends LoginPageFb {
	
	
	
	 public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	By FrameDiv=By.xpath("//div[@id='blueBarDOMInspector']");
	 By HomeButton=FrameDiv.xpath(".//a[text()='Home']");
	 By TextName=FrameDiv.xpath(".//span[text()='Samvidya']");
	 By loginButton=FrameDiv.xpath(".//input[@type='submit']");
	 

	 public void clickHomePage() {
		 try {
		 System.out.println("inside home");
		 boolean values=driver.findElement(HomeButton).isEnabled();
			
		 System.out.println(values);
			if(values=true) {
				
			driver.findElement(HomeButton).click();
			System.out.println("clicked home");
			
				Thread.sleep(2000);
			
			driver.findElement(TextName).click();
			Thread.sleep(2000);


			} 

	 }
	 	 
		 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 } 
	 
}
