package com.qa.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Launch extends DemoTest {
	
	public void waitUntil(String xpath) {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath")));
	}

//	@Test
//	public void Usecase1() throws InterruptedException
//
//	{
//		System.out.print("\nLaunching Browser\n");
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone X");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		driver.findElement(By.xpath("//div[@class='a-section']//span[text()='iOS']")).click();
//		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
//		driver.findElement(By.xpath("//a[text()='Price: High to Low']")).click();
//		List<WebElement> myList=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
//		System.out.println("\n----SIZE---\n"+myList.size());
//	     for (int i = 1; i <= myList.size(); i++)
//	     {
//	        String DeviceName = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])["+ i +"]")).getText();
//	        String Link = driver.findElement(By.xpath("(//a[@class='a-link-normal s-link-style a-text-normal'])["+ i +"]")).getAttribute("href");
//	        String Price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])["+ i +"]")).getText();	       
//	    	System.out.print(i+") Device Name : "+DeviceName+" Price : "+Price+" Link: "+Link+"\n");
//	     }
//		
//	}

	
	@Test
	public void Usecase2() throws InterruptedException

	{
		System.out.print("\nLaunching Browser\n");
		driver.get("https://www.browserstack.com/");
		driver.findElement(By.xpath("(//a[text()='Sign in'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("arpit+demo@browserstack.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Sign me in']")).click();
		driver.findElement(By.xpath("//div[@data-test-ositem='android']")).click();
		driver.findElement(By.xpath("//span[text()='Samsung']")).click();
		driver.findElement(By.xpath("//span[text()='Galaxy S21']")).click();
		driver.findElement(By.xpath("(//div[@data-test-device-browser='chrome'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		
	}	
	

}
