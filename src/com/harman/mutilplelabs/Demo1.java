package com.harman.mutilplelabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\testings\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		
		driver.get("https://www.db4free.net/");

		 driver.findElement(By.xpath("//b[contains(text(),'phpMy')]")).click();
		 
		 List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		 
		 System.out.println(windows.get(0));
		 System.out.println(windows.get(1));
		 
		 driver.switchTo().window(windows.get(1));
		 
		 driver.findElement(By.id("input_Username")).sendKeys("admin");
		 driver.findElement(By.name("pma_Password")).sendKeys("admin123");
		 
		 driver.findElement(By.id("input_go")).click();
		 
		 driver.close();


	}

}
