package com.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sample.DriverProvider;

public class CalorieCalculator {
  public static void main(String[] args) {
	   WebDriver wd=DriverProvider.getDriver();
       wd.get("https://www.calculator.net/calorie-calculator.html");
       WebElement age =  wd.findElement(By.name("cage"));
       WebElement gender1 =  wd.findElement(By.id("csex1"));
       WebElement gender2 =  wd.findElement(By.id("csex2"));
       age.clear();
       age.sendKeys("45");
     
       gender2.click();
  }
}
