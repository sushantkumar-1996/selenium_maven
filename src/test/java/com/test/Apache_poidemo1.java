package com.test;
//row count and column count in xl sheet

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Apache_poidemo1 {
  @Test
  public void f() throws IOException {
	  File src=new File("C:\\Users\\training_b6b.00.10\\Desktop\\Apache_Poitestdata1.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sh=wb.getSheetAt(0);
	  
	  System.out.println("first row number"+sh.getFirstRowNum());
	  System.out.println("last row num is"+sh.getLastRowNum());
	  int rowcount=sh.getLastRowNum()-sh.getFirstRowNum();
	  int noOfColumns = sh.getRow(0).getLastCellNum();
	  for(int i=0;i<=rowcount;i++) {
		 
		  for(int j=0;j<noOfColumns;j++ ) {
		  System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+"\t \t");}
		  System.out.println();
	  }
	  System.out.println("row count is"+rowcount);
	  //System.out.println(sh.getRow(0).getCell(0).getStringCellValue()+"\t\t"+sh.getRow(0).getCell(1).getStringCellValue());
  }
}
