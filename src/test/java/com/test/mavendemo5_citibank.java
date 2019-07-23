package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mavendemo5_citibank {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		String url="https://www.online.citibank.co.in/";
		driver.navigate().to(url);
		//Thread.sleep(10000);
		//Alert alt=driver.switchTo().alert();
		//alt.dismiss();
		//Thread.sleep(5000);
		//Alert alt2=driver.switchTo().frame();
		//alt2.dismiss();
		//driver.findElement(By.xpath("//*[@id=\"div-close\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Login")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentw=it.next();
		String childw=it.next();
		driver.switchTo().window(childw);
		driver.findElement(By.name("User_Id")).sendKeys("happiness641996@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("helloworld");
		driver.close();
		driver.switchTo().window(parentw);
		
		/*Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Alert is"+alt.getText());*/
  }
}
