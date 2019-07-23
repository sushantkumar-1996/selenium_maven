package com.test;
//static dropdown list with keys down action sequence for test me app
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mavendemo9 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  WebElement search=driver.findElement(By.id("myInput"));
	  Actions act1=new Actions(driver);
	  Thread.sleep(2000);
	  act1.sendKeys(search,"wear").perform();
	  Thread.sleep(2000);
	  act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
  }
}
