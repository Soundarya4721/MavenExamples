package com.facebookPom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceActivity {

	@Test(description = "To handle Autosuggestions Now a days its default feature of almost all the application take an example of Google itself when you type some words on search box, it gives some related suggestion.\r\n" + 
			"To achieve this we will use first mouse hover on element then click.\r\n" + 
			"\r\n" + 
			"")
	public void AutoSuggestions() {
		try {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='qsbSearchTab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='qp' and @placeholder='Skills, Designations, Companies']")).sendKeys("Software");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='allow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='qp' and @placeholder='Skills, Designations, Companies']")).sendKeys("Software");
		Actions builds=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//div[@class='suggest']//following::div[@id='sugDrp_qsb-keyskill-sugg']/ul/li[2]"));
		builds.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		builds.click(ele).build().perform();
		Thread.sleep(2000);
		System.out.println("Found drpdwn");
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
