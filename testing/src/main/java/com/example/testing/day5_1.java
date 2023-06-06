package com.example.testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		String title=driver.getTitle();
		if(title.equals("Home"))
		{
			System.out.println("Title are same");
		}
		else
		{
			System.out.println("Title are different");
		}
		
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		
		if(driver.getTitle().equals("Shop"))
		{
			System.out.println("Title are same");
		}
		else
		{
			System.out.println("Title are different");
		}
		

	}

}
