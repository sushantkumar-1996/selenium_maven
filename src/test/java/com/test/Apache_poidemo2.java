package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apache_poidemo2 {
  @Test
  public void f() throws IOException {
	  File src=new File("C:\\Users\\training_b6b.00.10\\Desktop\\Apache_Poitestdata2.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sh=wb.getSheetAt(0);
	  
	  System.out.println("first row number"+sh.getFirstRowNum());
	  System.out.println("last row num is"+sh.getLastRowNum());
	  int rowcount=sh.getLastRowNum()-sh.getFirstRowNum();
	  int noOfColumns = sh.getRow(0).getLastCellNum();
	  for(int i=0;i<=rowcount;i++) {
		 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com");
		  driver.findElement(By.linkText("Log in")).click();

		  for(int j=0;j<noOfColumns;j++ ) {
		  System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+"\t \t");
		  driver.findElement(By.id("Email")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
		  driver.findElement(By.name("Password")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
		  }
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  driver.close();
  }
	  //writing into excel file
	  for(int i=0;i<rowcount;i++) {
		  XSSFRow header=sh.getRow(0);
		  XSSFCell header2=header.createCell(2);
		  header2.setCellValue("Status");
		  sh.getRow(i).createCell(2).setCellValue("PASS");
		  sh.getRow(i).createCell(2).setCellValue("FAIL");
		  FileOutputStream fos=new FileOutputStream(src);
		  wb.write(fos);
		  }
	  }
}

