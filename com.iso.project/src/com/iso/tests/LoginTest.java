package com.iso.tests;

import org.testng.annotations.Test;

import com.iso.pages.LoginPage;

public class LoginTest 
{
	@Test
	public void loginTest() throws Exception
	{
		LoginPage lp=new LoginPage();
		
		
		lp.enterEmail();
		lp.enterPassword();
		Thread.sleep(5000);
		
		lp.clickLoginButton();
		Thread.sleep(5000);
		
		System.out.println("ISO Application Login Successfully");
		
	}
	
	
}
