package com.test;
//static dropdown list with keys down action sequence

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mavendemo8 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  WebElement search=driver.findElement(By.id("small-searchterms"));
	  Actions act1=new Actions(driver);
	  Thread.sleep(5000);
	  act1.sendKeys(search,"computer").perform();
	  Thread.sleep(5000);
	  act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  Assert.assertTrue(driver.getTitle().contains("Build"));
	  
  }
}
