package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_5 {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("desktop");
		driver.findElement(By.linkText("Returns")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Gift Certificates")).click();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
