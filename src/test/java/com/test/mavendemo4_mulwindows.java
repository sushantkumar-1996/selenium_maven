package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mavendemo4_mulwindows {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://demo.guru99.com/popup.php";
		driver.navigate().to(url);
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentw=it.next();
		String childw=it.next();
		driver.switchTo().window(childw);
		driver.findElement(By.name("emailid")).sendKeys("happiness641996@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		System.out.println("child window title is "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentw);
		System.out.println("parentwindow title is "+driver.getTitle());
		
  }
}
