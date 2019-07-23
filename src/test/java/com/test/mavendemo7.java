package com.test;
//Test me app about us implement multiple windows and actions (incomplete) 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mavendemo7 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.manage().window().maximize();
	  Actions act1=new Actions(driver);
	  act1.moveToElement(driver.findElement(By.xpath(""))).perform();
	  
  }
}
