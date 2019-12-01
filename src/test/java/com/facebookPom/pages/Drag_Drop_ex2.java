package com.facebookPom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop_ex2 {
	
	
	@Test
	public void DragDrp() {
		try {
		WebDriverManager.iedriver().setup();
		WebDriver driver= new InternetExplorerDriver();
		Thread.sleep(2000);
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Create object of actions class
		Actions act=new Actions(driver);
		//Drag and Drop using action cls and movetoElement
		WebElement elem1=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement elem2=driver.findElement(By.xpath("//div[@id='droppable']"));
	Thread.sleep(2000);
	act.clickAndHold(elem1).pause(2000).moveToElement(elem2).release().build().perform();
	System.out.println("found the drop");	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
