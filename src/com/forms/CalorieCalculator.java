package com.forms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sample.DriverProvider;

public class CalorieCalculator {
  public static void main(String[] args) {
	   WebDriver wd=DriverProvider.getDriver();
       wd.get("https://www.calculator.net/calorie-calculator.html");
       WebElement age =  wd.findElement(By.name("cage"));
       //wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      // WebElement gender1 =  wd.findElement(By.id("csex1"));
       // WebElement gender2 =  wd.findElement(By.id("csex2"));
       List<WebElement> radiobuttons=wd.findElements(By.className("rbmark"));
       age.clear();
       age.sendKeys("45");
       System.out.println(radiobuttons.size());
       radiobuttons.get(1).click();
       //System.out.println(gender1.isDisplayed()+" "+gender2.isDisplayed());
       //gender2.click();
  }
}
