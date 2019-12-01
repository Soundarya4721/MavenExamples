package com.facebookPom.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecuterExampls {
  @Test
  public void JavascrptExcutor() {
	  //JavaScriptExecutor Methods
	  
	  //ExecuteAsyncScript:With Asynchronous script, your page renders more quickly. 
	  //Instead of forcing users to wait for a script to download before the page renders. 
	  //This function will execute an asynchronous piece of JavaScript in the context of the currently selected frame or window in Selenium. 
	  //The JS so executed is single-threaded with a various callback function which runs synchronously.
	  
	 //Perform sleep in browser under test-AsyncScript
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  driver.get("https://www.facebook.com");
      //Maximize window		
      driver.manage().window().maximize();		
      //Set the Script Timeout to 20 seconds		
      driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
    		

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  


	  
	  
	  
  }
}
