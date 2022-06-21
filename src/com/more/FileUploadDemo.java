package com.more;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sample.DriverProvider;

public class FileUploadDemo {
   public static void main(String n[]) throws IOException {
	   WebDriver wd= DriverProvider.getDriver();
	   wd.get("https://document.online-convert.com/convert-to-doc");
	   wd.findElement(By.xpath("/html/body/div[4]/div[3]/div[1]/div/div/div/button"))
	   .click();
	   Runtime.getRuntime().exec("e:\\scripts\\script.exe");
	   
   }
}
