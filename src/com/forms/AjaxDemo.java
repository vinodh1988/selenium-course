package com.forms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sample.DriverProvider;

public class AjaxDemo {
   public static void main(String[] args) {
	  WebDriver wd=DriverProvider.getDriver();
	  wd.get("http://data.worldbank.org/");
	  wd.findElement(By.id("selector")).sendKeys("India");
	  WebDriverWait wait=new WebDriverWait(wd,Duration.ofSeconds(60));
	  
	  
	  String cssSelector=".highlighted-selection > div:nth-child(1) > b:nth-child(1)";
	  wait.until(ExpectedConditions.elementToBeClickable(
	  By.cssSelector(cssSelector)));
	  
	  wd.findElement(By.cssSelector(cssSelector)).click();

   }
}
