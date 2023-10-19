package com.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omrbranch2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:omrbranch.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("type="text"));


}
}