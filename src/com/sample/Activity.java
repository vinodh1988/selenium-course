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
	    String n[]= {"India","China","Japan","Pakistan","Thailand"};
	    for(String x:n) {
	    element =	wd.findElement(By.name("q"));
	        element.clear();
	    	element.sendKeys(x);
	    	element.sendKeys(Keys.RETURN);
	  
	    			wd.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[3]/div/div/div[1]/div/div[1]/a/h3")).click();
	    	wd.navigate().back();
	    }  
	   
	}
}
