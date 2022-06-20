package com.more;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sample.DriverProvider;

public class DragAndDrop {
   public static void main(String n[]) {
	      WebDriver wd=DriverProvider.getDriver();
		  wd.get("https://the-internet.herokuapp.com/drag_and_drop");
		  WebElement source = wd.findElement(By.id("column-a"));
		  WebElement destination = wd.findElement(By.id("column-b"));
		  Actions action=new Actions(wd);
	      action.dragAndDrop(destination, source).build().perform();	  
	      System.out.println("Dragged and dropped");
   }
   
}
