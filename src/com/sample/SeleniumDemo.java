package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SeleniumDemo {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "E:/selenium/chromedriver.exe");
       WebDriver wd=new ChromeDriver();
       wd.get("http://www.google.co.in");
       
    }
}
