package com.forms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sample.DriverProvider;

public class WaitDemo {
   public static void main(String n[]) {
	 WebDriver wd =  DriverProvider.getDriver();
	// wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 WebDriverWait wait=new WebDriverWait(wd,Duration.ofSeconds(60));
	 wd.get("https://www.booking.com/");
	 wd.findElement(By.name("ss")).sendKeys("Chennai");
	 String xpath="//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]";
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
     wd.findElement(By.xpath(xpath)).click();	 
   }
}
