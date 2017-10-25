package com.quasio.adding.excelSheetAnd.data;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingNewExcelAndAddingSheets {

	public static void main(String[] args) throws Exception {
		System.out.println("Start");
		String filePath = System.getProperty("user.dir") + "/Evidence.xlsx";
		FileOutputStream fos = new FileOutputStream(new File(filePath));

		XSSFWorkbook wb = new XSSFWorkbook();
		wb.createSheet("RDS");
		wb.createSheet("BFS");
		wb.createSheet("MAP");
		wb.createSheet("BCP");

		XSSFSheet rdsSheet = wb.getSheet("RDS");
		rdsSheet.createRow(0).createCell(0).setCellValue("Setting in RDS");

		XSSFSheet bfsSheet = wb.getSheet("BFS");
		bfsSheet.createRow(0).createCell(0).setCellValue("Setting in BFS");

		XSSFSheet mapSheet = wb.getSheet("MAP");
		mapSheet.createRow(0).createCell(0).setCellValue("Setting in MAP");

		XSSFSheet bcpSheet = wb.getSheet("BCP");
		bcpSheet.createRow(0).createCell(0).setCellValue("Setting in BCP");

		wb.write(fos);
		wb.close();
		fos.close();
		System.out.println("End");
	}

}
