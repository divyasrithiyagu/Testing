package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_3 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("divya");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("t");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("divya@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("0976");
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
	}

}
