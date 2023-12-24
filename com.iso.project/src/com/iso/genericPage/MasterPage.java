package com.iso.genericPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {

	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;

	// Constructor Implementation
	public MasterPage() throws Exception {

		// configuration properties file implementation
		FileInputStream ip = new FileInputStream(".\\src\\com\\iso\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);
		// locators properties file implementation
		FileInputStream fs = new FileInputStream(".\\src\\com\\iso\\repository\\locators.properties");
		or = new Properties();
		or.load(fs);
		//test data properties file implementation
		FileInputStream ts = new FileInputStream(".\\src\\com\\iso\\repository\\testdata.properties");
		td = new Properties();
		td.load(ts);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) 
		{
			//WebDriverManager.chromedriver().setup();
			//driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\com.iso.drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\com.iso.drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}else
		{
			System.out.println("No Browser Details Found");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
}
