package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class day3_1 
{
    public static void main( String[] args )
    {
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver=new EdgeDriver();
    	//launching the url
    	
    	
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	//maximizing the window
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("sample");
    	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("1");
    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("abcd@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("abcd");
    	driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
    	
       JavascriptExecutor js=(JavascriptExecutor) driver;
    	
    	js.executeScript("windows.scrollBy(0,1500)","");
    }
}
