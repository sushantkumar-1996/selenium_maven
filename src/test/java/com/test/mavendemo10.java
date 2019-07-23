package com.test;
//drag and drop actions
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class mavendemo10 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  WebElement from=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	  WebElement to=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_priceChecker\"]/div[1]"));
	  Actions act1=new Actions(driver);
	  Thread.sleep(2000);
	  act1.dragAndDrop(from,to).perform();
	  Thread.sleep(10000);
	  String price=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
	  System.out.println("the final price is"+price);

  }
}
