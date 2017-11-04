package com.guoyasoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.hash.BloomFilter;

public class guoya {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.baidu.com/");
		
		Boolean isSuccess=driver.getPageSource().contains("百度一下");
		System.out.println(isSuccess);
		
		Thread.sleep(2000);
		
		WebElement userName=driver.findElement(By.id("kw"));
		userName.clear();
		userName.sendKeys("果芽软件");
		
		Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.id("su"));
		submit.click();
		
		Thread.sleep(2000);
		
		isSuccess=driver.getPageSource().contains("果芽软件");
		System.out.println(isSuccess);
		
		driver.quit();
		
	}

}
