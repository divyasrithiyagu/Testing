package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("dfghj@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();

	}

}
