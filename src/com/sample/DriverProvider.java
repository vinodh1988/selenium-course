package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {
	
   public static WebDriver getDriver() {
	   System.setProperty("webdriver.chrome.driver", "E:/selenium/chromedriver.exe");
       WebDriver wd=new ChromeDriver();
       return wd;
   }
}
