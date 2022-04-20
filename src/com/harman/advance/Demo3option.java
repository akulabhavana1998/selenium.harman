package com.harman.advance;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo3option {

	public static void main(String[] args) {
	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		options.addArguments("--headless");
System.setProperty("webdriver.chrome.driver","D:\\testings\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.irctc.co.in/nget/train-search");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
		
		
		
		
		
		
		
	}

}
