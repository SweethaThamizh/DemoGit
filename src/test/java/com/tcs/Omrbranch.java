package com.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omrbranch {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:omrbranch.com/");
		driver.manage().window().maximize();
//		WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("Lakshitha");
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("laksh@123");
	}

}
