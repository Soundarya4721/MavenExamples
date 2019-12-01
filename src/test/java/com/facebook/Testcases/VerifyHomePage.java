package com.facebook.Testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.facebookPom.pages.HomePage;

public class VerifyHomePage extends VerifyFacebookLogin{

	
	VerifyFacebookLogin vf=new VerifyFacebookLogin();
	HomePage hp=new HomePage(driver);
	
	@Test
	public void verifyHomePage() {
		try {
			Thread.sleep(5000);
			
			System.out.println("inside homepage");
			hp.clickHomePage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
}
