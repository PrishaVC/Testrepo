package com.iso.genericPage;

import org.openqa.selenium.By;

public class CommonMethods extends MasterPage
{
public CommonMethods() throws Exception
{
	super();
}
public void enterData(String xpathkey, String testdata)
{
driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(td.getProperty(testdata));	
}

public void click(String xpathkey)
{
driver.findElement(By.xpath(or.getProperty(xpathkey))).click();	
}
}
