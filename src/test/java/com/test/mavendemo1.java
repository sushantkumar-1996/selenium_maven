package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mavendemo1 {
	WebDriver driver=null;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe");
	  driver=new ChromeDriver();
	  String url="http://www.google.com";
      driver.get(url);
	  System.out.println("title of the page"+driver.getTitle());
  }
}
