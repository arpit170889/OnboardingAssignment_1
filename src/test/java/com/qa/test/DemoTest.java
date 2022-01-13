package com.qa.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoTest {


	String folderPath = System.getProperty("user.dir");
	String driverLocation = null;
	static WebDriver driver;

	
	public String readUserInput(String key) throws IOException {
		Properties p=new Properties(); 
		FileReader reader=new FileReader(folderPath+"/userInput.properties");   
	    p.load(reader);  
		return p.getProperty(key);
	}

	@BeforeSuite
	public void intilaise() throws IOException {
		String os = readUserInput("browser");	
		System.out.println("BrowserInput----"+os);
		switch (os) {
		
		case "chrome":
			
			driverLocation = folderPath + "/src/test/resources/driver/chromedriver";
			System.out.print("\n-----LOCATION----"+driverLocation);
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();
		break;
			
		case "firefox":
			driverLocation = folderPath + "/src/test/resources/driver/geckodriver";
			System.out.print("\n-----LOCATION----"+driverLocation);
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();
			
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}



	@AfterTest

	public void close()

	{
		driver.close();
		driver.quit();
	}


}
