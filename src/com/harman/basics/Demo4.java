package com.harman.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\testings\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.goto.com/meeting/");
		 
		 driver.findElement(By.id("truste-consent-button")).click();
		 
		 driver.findElement(By.linkText("Try Free")).click();
		 
		 
		 driver.findElement(By.id("first-name")).sendKeys("Anand");
		 driver.findElement(By.id("last-name")).sendKeys("Kumar");
		 
		 driver.findElement(By.id("login_email")).sendKeys("anandpk@gmail.com");
		 
		 driver.findElement(By.id("login_password")).sendKeys("anandpk123");
		 
		 driver.findElement(By.id("CompanySize")).sendKeys("10-99");
		 
		 driver.findElement(By.className("common-button__button")).click();
		 
	}
}