package com.Learn.Excel;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
File src =new File("//Users//mohitgodara//Documents//TestData//TestData1.xlsx");
//File src =new File("//Users//mohitgodara//Desktop//puzzle.txt");
//System.out.println(System.getProperty("user.dir"));
FileInputStream fis =new FileInputStream(src);
//System.out.println(fis.read());
XSSFWorkbook wb =new XSSFWorkbook(fis);
XSSFSheet nameAndAge =wb.getSheetAt(1);
String name =nameAndAge.getRow(1).getCell(0).getStringCellValue();
System.out.println(name);

System.out.println(nameAndAge.getLastRowNum());
//System.out.println(nameAndAge.);
wb.close();
	}

}
