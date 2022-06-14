package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CSVGenerator {
  public static void main(String[] args) {
	  WebDriver wd=DriverProvider.getDriver();
	   wd.get("https://en.wikipedia.org/wiki/Rice_production_in_India");
	   //WebElement element= wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/table[1]/tbody/tr[1]"));
	   List<WebElement> elements= 
	wd.findElements(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/table[1]/tbody/tr"));
      System.out.println("Number of rows::"+elements.size());
	 
     String result="";
      
      for(int i=0;i<elements.size();i++) {
   	   List<WebElement> tds = elements.get(i).findElements(By.tagName("td"));
   	   for(int j=0;j<tds.size();j++) {
   		  result+=tds.get(j).getText();
   		  if(j!=tds.size()-1)
   			 result+=", ";
   	   }
   	   result+="\n";
      }
      System.out.println(result);
  }
  
}
