package com.more;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sample.DriverProvider;

public class SeleniumAlertTest {
   public static void main(String[] args) throws Exception {
	   WebDriver wd=DriverProvider.getDriver();
	   wd.get("https://www-archive.mozilla.org/projects/ui/accessibility/unix/testcase/html/#Button_Test_Cases");
       wd.findElement(By.name("B1")).click();
       Thread.sleep(2000);
       wd.switchTo().alert().accept();
   }
}
