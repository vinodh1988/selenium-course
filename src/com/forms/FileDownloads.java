package com.forms;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sample.DriverProvider;

public class FileDownloads {
  public static void main(String[] args) {
   
   Map<String,Object> preferences =new Hashtable<String,Object>();  
   preferences.put("download.prompt_for_download", false);
   preferences.put("download.default_directory", "d:\\books");
   
   ChromeOptions options = new ChromeOptions();
   options.setExperimentalOption("prefs", preferences);	
  
   System.setProperty("webdriver.chrome.driver", "E:/selenium/chromedriver.exe");
   WebDriver wd=new ChromeDriver(options);
   
   wd.get("http://www.ignouhelp.in/ignou-ibo-01-study-material/");
   List<WebElement> list=wd.findElements(By.xpath("/html/body/div[1]/div[3]/div/div/div[1]/main/article/div/table/tbody/tr"));
   System.out.println(list.size());
   for(int i=1;i<list.size();i++) {
	   list.get(i).findElement(By.xpath("td/a")).click();
   }
  }
}
