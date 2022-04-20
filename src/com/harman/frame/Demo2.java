package com.harman.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\testings\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		
		driver.get("https://demo.openemr.io/b/openemr/");
		
        driver.findElement(By.id("authUser")).sendKeys("admin");
		 
		 driver.findElement(By.id("clearPass")).sendKeys("pass");
		 
		 Select selectChoiceLang=new Select(driver.findElement(By.name("languageChoice")));
	     selectChoiceLang.selectByIndex(2);
	     
		 driver.findElement(By.id("Login")).click();
		 

	}

}
