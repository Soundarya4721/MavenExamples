package com.facebookPom.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingAlerts {

	
	WebDriver driver=null;
	
By SearchButton=By.xpath("//input[@id='searchBtn']");
	
	public HandlingAlerts(WebDriver driver) {
		this.driver=driver;	
	}
	
//Alert handling
	
	public void alertPresence(WebDriver driver) {
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
	}
	
	
	public void clickSearch(WebDriver driver) {
		WebElement SeaearchPageFrame=driver.findElement(By.xpath("//div[@class='search']"));	

		driver.switchTo().defaultContent();
		
		System.out.println("click on");
		driver.findElement(SearchButton).click();
		System.out.println("clicked search");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		alertPresence(driver);
	}
	
}
