package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class mavendemo3 {
	WebDriver driver=null;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email'][ @name='Email']")).sendKeys("happiness641996@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password' and @name='Password']")).sendKeys("skdemowebshop");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		driver.close();
		
		//extent reporter
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("C:\\Users\\training_b6b.00.10\\Desktop\\Reportfolder\\MyReport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("demo");
		logger.log(Status.INFO, "selenium web drivr");
		logger.log(Status.PASS, "Action demo was executeed successfully");
		logger.log(Status.FAIL, "Dont know why");
		logger.log(Status.FAIL, MarkupHelper.createLabel("Dont know why", ExtentColor.RED));
		extent.flush();
		
		
  }
}
