package com.more;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.sample.DriverProvider;

public class SeleniumAlertTest {
   public static void main(String[] args) throws Exception {
	   WebDriver wd=DriverProvider.getDriver();
	   wd.get("https://www-archive.mozilla.org/projects/ui/accessibility/unix/testcase/html/#Button_Test_Cases");
       wd.findElement(By.name("B1")).click();
       Thread.sleep(2000);
       wd.switchTo().alert().accept();
       
       Thread.sleep(2000);
       
       JavascriptExecutor js =(JavascriptExecutor)wd;
     
       js.executeScript("alert('The previous alert box was closed')");
       
       Thread.sleep(2000);
       wd.switchTo().alert().accept();
       
        js.executeScript("a=prompt('enter your name');alert(a);");
       
       
   }
}
