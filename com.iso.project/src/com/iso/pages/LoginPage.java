package com.iso.pages;

import com.iso.genericPage.CommonMethods;

public class LoginPage  extends CommonMethods
{
	public LoginPage() throws Exception
	{
		super();
	}

	//Enter User name
	public void enterEmail()
	{
		enterData("UserName","testData1");
	}
	//Enter Password
	public void enterPassword()
	{
		enterData("Password","testData2");
	}
	
	public void clickLoginButton()
	{
		click("LoginButton");
	}
}
