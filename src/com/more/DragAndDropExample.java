package com.more;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sample.DriverProvider;

public class DragAndDropExample {
   public static void main(String[] args) {
	      WebDriver wd=DriverProvider.getDriver();
		  wd.get("https://www.globalsqa.com/demoSite/practice/droppable/photo-manager.html");
		  List<WebElement> list=wd.findElements(By.xpath("//*[@id='gallery']/li"));
		  WebElement trash =wd.findElement(By.id("trash"));
		  System.out.println(list.size());
          
		  Actions action=new Actions(wd);
		  
		  for(WebElement source:list)
		  {
			  action.pause(Duration.ofSeconds(2));
			  action.dragAndDrop(source, trash).build().perform();
           }
}}
