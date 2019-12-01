package com.facebookPom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_Drop {
	@Test(priority = 1)
	public void dragAndDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ltatavarthy\\Documents\\chromedriver\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		//Drag and Drop using action cls and movetoElement
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement elem1=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement elem2=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);//initiating action class
		Thread.sleep(2000);
		act.dragAndDrop(elem1, elem2).build().perform();
		System.out.println("dropped");
		Thread.sleep(3000);
		driver.close();
		
	}
	@Test(priority = -2)
	public void dragAndDrop_Coordinates() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ltatavarthy\\Documents\\chromedriver\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		//Drag and Drop using action cls and movetoElement
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement elem1=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement elem2=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);//initiating action class
		Thread.sleep(2000);
		int x=elem2.getLocation().getX();
		int y=elem2.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		
		act.dragAndDropBy(elem1, x, y).build().perform();
		System.out.println("dropped");
		Thread.sleep(2000);
		driver.close();	
	}
	
	
	
	
	
	
	

}
