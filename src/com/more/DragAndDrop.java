package com.more;

import java.time.Duration;

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
		  int x=destination.getLocation().x;
		  int x1=source.getLocation().x;
		  int y=destination.getLocation().y;
		  System.out.println(x+" "+y);
		  Actions action=new Actions(wd);
	  //    action.dragAndDropBy(source,x1-x,y);
		  action.moveToElement(source)
		    .pause(Duration.ofSeconds(1))
		    .clickAndHold(source)
		    .pause(Duration.ofSeconds(1))
		    .moveByOffset(x, y)
		    .moveToElement(destination)
		    .moveByOffset(x,y)
		    .pause(Duration.ofSeconds(2))
		    .release().build().perform();
	      System.out.println("Dragged and dropped");
   }
   
}
