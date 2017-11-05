package com.guoyasoft;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FirstTestNGTestTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement userName=driver.findElement(By.id("kw"));
		userName.clear();
		userName.sendKeys("果芽软件");
		
		Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.id("su"));
		submit.click();
		
		Thread.sleep(2000);
		
		boolean result=driver.getPageSource().contains("果芽软件");
		
		 Assert.assertEquals(true, result);
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.baidu.com/");
		
		Thread.sleep(2000);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
