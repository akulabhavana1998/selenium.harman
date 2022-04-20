package com.harman.mutilplelabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\testings\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.online.citibank.co.in/");
		
		
		 driver.findElement(By.name("Login")).click();
		 driver.findElement(By.id("Forgot User ID?")).click();
		 
		

	}

}
