package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableManipulation {
   public static void main(String n[]) {
	   WebDriver wd=DriverProvider.getDriver();
	   wd.get("https://en.wikipedia.org/wiki/Rice_production_in_India");
	   //WebElement element= wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/table[1]/tbody/tr[1]"));
	   List<WebElement> elements= wd.findElements(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/table[1]/tbody/tr"));
       System.out.println("Number of rows::"+elements.size());
	   List<WebElement> list=elements.get(0).findElements(By.tagName("td"));
       List<String> headings=new ArrayList<String>();
       System.out.println(list.size());
       
       for(WebElement x:list)
       {
    	  headings.add(x.getText());   
       }
       
       System.out.println(headings);
       
       JSONObject json=new JSONObject();
       JSONArray array=new JSONArray();
       json.put("RiceProduction", array);
       
       for(int i=1;i<elements.size();i++) {
    	   List<WebElement> tds = elements.get(i).findElements(By.tagName("td"));
    	   JSONObject current=new JSONObject();
    	   for(int j=0;j<tds.size();j++) {
    		   current.put(headings.get(j), tds.get(j).getText());
    	   }
    	   array.add(current);
       }
       System.out.println(json);
   }
}
