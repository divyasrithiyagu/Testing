package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_4 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
        driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("shri");
        driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("sdfghj@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("divya");
        driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("divya@gmai.com");
        driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("it should be attractive");
        driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("45670");
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
        
      }

}
