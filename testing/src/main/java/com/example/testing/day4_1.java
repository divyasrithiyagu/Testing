package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
    	WebDriver driver=new EdgeDriver();
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("abcd");
    	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("rt");
    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("abcd@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("1234");
    	driver.findElement(By.xpath("//*[@id=\\\"input-newsletter-yes\\\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
    	
    	
    	

	}

}
