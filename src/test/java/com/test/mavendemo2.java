package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mavendemo2 {
	WebDriver driver=null;
  @Test
  public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
	    
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Alert is"+alt.getText());
		alt.accept();//ok button
		alt.dismiss();//cancel button
		
  }
}
