package com.harman.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBRegister {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\testings\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("bakula");
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("akula");
		driver.findElement(By.name("reg_email__")).sendKeys("bakula@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bakula@gmail.com");
		driver.findElement(By.cssSelector("#password_step_input")).sendKeys("bakula@123");
		
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("29");
		
		Select selectMon=new Select(driver.findElement(By.name("birthday_month")));
		selectMon.selectByValue("12");
		
		
		Select selectyear=new Select(driver.findElement(By.id("year")));
		selectyear.selectByVisibleText("2000");
		
		Select selectPro = new Select(driver.findElement(By.name("preferred_pronoun")));
		selectPro.selectByIndex(3);
		
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		driver.findElement(By.name("websubmit")).click();


		
		
		
		
	}

}
