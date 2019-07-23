package com.test;
//actions mouse hover
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mavendemo6_actions {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.hdfcbank.com/.");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Actions act1=new Actions(driver);
	  act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
	  Thread.sleep(1000);
	  act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).perform();
	  Thread.sleep(1000);
	  act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']"))).click().build().perform();
	  System.out.println("page url is"+driver.getCurrentUrl());
	  Assert.assertTrue(driver.getTitle().startsWith("Demat"));
	  Thread.sleep(2000);
	  driver.close();

  }
}
