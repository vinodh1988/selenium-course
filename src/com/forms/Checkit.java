package com.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sample.DriverProvider;

public class Checkit {
   public static void main(String[] args) {
	 //  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
	   WebDriver driver = DriverProvider.getDriver();
	   driver.get("https://demo.guru99.com/test/drag_drop.html");
	   driver.manage().window().maximize();

	   WebElement source = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a")) ;
	   WebElement destination = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li")) ;
	   Actions action = new Actions(driver);

	   action.dragAndDrop(source, destination).build().perform();
}
}
