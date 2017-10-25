package com.reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Reading_Data {

	public static void main(String[] args) throws Exception {
		String src = "//Users//mohitgodara//Documents//TestData//TestData1.xlsx";
		String src1 = "//Users//mohitgodara//Documents//TestData//TestData2.xlsx";
	File file =new File(src);
	FileInputStream fis =new FileInputStream(file);
	File file1 =new File(src1);
	
//	FileOutputStream fos =new FileOutputStream(file);
//	FileOutputStream fos =new FileOutputStream(src);
	XSSFWorkbook wb =new XSSFWorkbook(fis);
	XSSFSheet sheet =wb.getSheet("Sum");
	
	int totalRows =sheet.getLastRowNum();
	

//	for (int i=1;i<=totalRows;i++){
//	int i1 =(int) sheet.getRow(i).getCell(1).getNumericCellValue();
//	int i2 =(int) sheet.getRow(i).getCell(1).getNumericCellValue();
//	System.out.println("Input1: "+i1+"     "+"Input2: "+i2 +"    "+"Sum: "+(i1+i2));
//
//	
////		String name =sheet.getRow(i).getCell(0).getStringCellValue();
////		int age =(int) sheet.getRow(i).getCell(1).getNumericCellValue();
////		System.out.println("Name: "+name+"     "+"Age: "+age);
//		
//	}
	
	for (int i=1;i<=totalRows;i++){
		int i1 =(int) sheet.getRow(i).getCell(0).getNumericCellValue();
		int i2 =(int) sheet.getRow(i).getCell(1).getNumericCellValue();
		int sum =i1+i2;
		System.out.println("Input1: "+i1+"     "+"Input2: "+i2 +"    "+"Sum: "+sum);
		sheet.getRow(i).createCell(2).setCellValue(sum);

	}
	sheet.getRow(0).createCell(2).setCellValue("Sum");
	
	FileOutputStream fos =new FileOutputStream(file1);
	wb.write(fos);
	
	wb.close();
	

	}

}
