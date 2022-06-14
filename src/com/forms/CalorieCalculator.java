package com.forms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.sample.DriverProvider;

public class CalorieCalculator {
  public static void main(String[] args) {
	   WebDriver wd=DriverProvider.getDriver();
       wd.get("https://www.calculator.net/calorie-calculator.html");
       WebElement age =  wd.findElement(By.name("cage"));
       WebElement height = wd.findElement(By.name("cheightmeter"));
       WebElement weight = wd.findElement(By.name("ckg"));
       Select select = new Select( wd.findElement(By.name("cactivity")));
       
       List<WebElement> radiobuttons=wd.findElements(By.className("rbmark"));
       age.clear();
       age.sendKeys("45");
       System.out.println(radiobuttons.size());
       radiobuttons.get(1).click();
       height.clear();weight.clear();
       height.sendKeys("185");
       weight.sendKeys("69");
       select.selectByIndex(4);
       
       WebElement button = wd.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/table[4]/tbody/tr[3]/td[2]/input[2]"));
       button.click();
       //System.out.println(gender1.isDisplayed()+" "+gender2.isDisplayed());
       //gender2.click();
     //wd.manage().timeouts().implicitlyWait(10,TimeUnit.SENDS);
       // WebElement gender1 =  wd.findElement(By.id("csex1"));
        // WebElement gender2 =  wd.findElement(By.id("csex2"));
  }
}
