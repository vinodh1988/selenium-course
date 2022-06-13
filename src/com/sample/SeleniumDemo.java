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
       System.out.println(wd.getCurrentUrl());
       System.out.println(wd.getTitle());
       System.out.println("######################################################################################");
       //System.out.println(wd.getPageSource());
       wd.navigate().to("http://www.msn.com");
       wd.navigate().back();
       wd.navigate().to("http://www.amazon.in");
       wd.close();
   }
       
    }
   
   /*
    * WebDriver -interface
    * ChromeDriver -implementation
    * 
    * interface is a collection of unimplemented methods which would
    * generally implemented classess
    * 
    * interface cannot have objects
    * 
    * interface can have reference variables
    * 
    * interface reference variable can hold object of class which
    * is implementing the interface
    * 
    * Methods & variables are classified into two types
    *   1. non static [instance]
    *   2. static [class]
    *   
    *   class A{
    *     int a; //for each object seperate copy of a is created [non static]/instance
    *     static int b; //for all the objects only one copy b will be created
    *              //static members can be called by using class name itself
    *   }
    * */
    

