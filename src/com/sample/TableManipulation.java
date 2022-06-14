package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableManipulation {
   public static void main(String n[]) {
	   WebDriver wd=DriverProvider.getDriver();
	   wd.get("https://en.wikipedia.org/wiki/Rice_production_in_India");
	   WebElement element= wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/table[1]/tbody/tr[1]"));
       List<WebElement> list=element.findElements(By.tagName("td"));
       System.out.println(list.size());
   }
}
