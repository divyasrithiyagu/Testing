package com.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day7_2 {
	int num1=20;
	int num2=10;
  @Test(priority = 1)
  public void add() {
	  
	  int sum=num1+num2;
	  Assert.assertEquals(sum, 30);
  }
  @Test(priority = 2)
  public void sub() {
	  
	  int minus=num1-num2;
	  Assert.assertEquals(minus, 10);
  }
  @Test(priority = 3)
  public void mul() {
	  
	  int product=num1*num2;
	  Assert.assertEquals(product, 200);
  }
  @Test(priority = 4)
  public void div() {
	  
	  int divde=num1/num2;
	  Assert.assertEquals(divde, 2);
  }
}
