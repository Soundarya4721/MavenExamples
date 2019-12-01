package com.facebookPom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSelectdropdown {
	WebDriver driver=null;

	public HandlingSelectdropdown(WebDriver driver) {
		this.driver=driver;
	}
	//selectors
	By Dayselect=By.xpath("//select[@id='day']");
	By DateSelect=By.xpath("//select[@id='month']");
	By YearSelect=By.xpath("//select[@id='year']");
	
	
	public void selectdropdwn(WebDriver driver) {
		//select day from drop down
		//select by value
		String Day="10";
		String Month="May";
		String Year="1993";
		
		Select select=new Select(driver.findElement(DateSelect));
		select.selectByValue(Day);
		
		
		Select selectday=new Select(driver.findElement(Dayselect));
		//Select by index
		selectday.selectByIndex(5);
		
		Select selectyear=new Select(driver.findElement(YearSelect));
		//Select by Visable text
		selectyear.selectByVisibleText(Year);
		
	}
}
