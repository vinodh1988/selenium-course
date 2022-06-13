package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity {
    public static void main(String[] args) {
		WebDriver wd = DriverProvider.getDriver();
		wd.get("http://google.co.in");
	    WebElement element =	wd.findElement(By.name("q"));
	    element.sendKeys("India");
	    element.sendKeys(Keys.RETURN);
	    wd.findElement(By.cssSelector("#rso > div:nth-child(3) > div > div > div.FCIUXc > div > div.yuRUbf > a")).click();
	   
	   
	}
}
