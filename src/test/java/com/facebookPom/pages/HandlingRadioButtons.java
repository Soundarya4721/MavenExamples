package com.facebookPom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingRadioButtons {
	
public WebDriver driver=null;
	
public HandlingRadioButtons(WebDriver driver) {
		this.driver=driver;
		
}

By RadioButtonFemale=By.xpath("//label[text()='Male']");
	public void RadioButton(WebDriver driver) {
		try {
		//Methods of all radio buttons and check boxes
		WebElement elem=driver.findElement(RadioButtonFemale);
		boolean enable=elem.isEnabled();
		boolean Displayed=elem.isDisplayed();
		System.out.println(enable);
		System.out.println(Displayed);
		
			Thread.sleep(2000);
		 
		elem.click();
		boolean selected=elem.isSelected();
		System.out.println(selected);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
