package com.quasio.multipleThreading;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public final class ExcelWorkBook {
	/**
	 * It's a Wrapper class over Apache POI XSSFWorkbook 
	 * to make entring data in ExcelSheet thread safe.
	 * 
	 * @author mohitgodara
	 */

	private static XSSFWorkbook wb;
	private static XSSFSheet rds;
	private static XSSFSheet bfs;
	private static XSSFSheet map;
	private static XSSFSheet bcp;
	private static int rdsSheetRowCounter = 0;
	private static int bfsSheetRowCounter = 0;
	private static int mapSheetRowCounter = 0;
	private static int bcpSheetRowCounter = 0;
	private static final ExcelWorkBook workBook = new ExcelWorkBook();

	private ExcelWorkBook() {
		wb = new XSSFWorkbook();

		// Creating different sheets in the workbook :
		rds = wb.createSheet("RDS");
		bfs = wb.createSheet("BFS");
		map = wb.createSheet("MAP");
		bcp = wb.createSheet("BCP");

		// Creating blank cells in all sheets of the workbook :
		for (int i = 0; i < 150; i++) {
			rds.createRow(i);
			bcp.createRow(i);
			bfs.createRow(i);
			map.createRow(i);
			for (int j = 0; j < 150; j++) {
				rds.getRow(i).createCell(j);
				bcp.getRow(i).createCell(j);
				bfs.getRow(i).createCell(j);
				map.getRow(i).createCell(j);
			}
		}
	}

	protected ExcelWorkBook getInstance() {
		return workBook;
	}

	
	/**
	 * Below method takes information about what are the values to be inserted in
	 * which Sheet and what is the table name.
	 * 
	 * @param sheetName
	 * @param tableName
	 * @param list
	 * @throws NoSheetPresentException
	 * 
	 * @author mohitgodara
	 */
	public static synchronized void enterDataInExcel(String sheetName, String tableName, List<Map<String, Object>> list)
			throws NoSheetPresentException {
		XSSFSheet sheet = null;
		int counter;

		switch (sheetName) {
		case "rds":
			sheet = rds;
			counter = rdsSheetRowCounter;
			insertListInExcel(sheet, sheetName, tableName, counter, list);
			break;
		case "bfs":
			sheet = bfs;
			counter = bfsSheetRowCounter;
			insertListInExcel(sheet, sheetName, tableName, counter, list);
			break;
		case "map":
			sheet = map;
			counter = mapSheetRowCounter;
			insertListInExcel(sheet, sheetName, tableName, counter, list);
			break;
		case "bcp":
			sheet = bcp;
			counter = bcpSheetRowCounter;
			insertListInExcel(sheet, sheetName, tableName, counter, list);
			break;
		default:
			System.out.println("No sheet present with name like '" + sheetName + "'");
			throw new NoSheetPresentException();
		}
	}

	
	/**
	 * Below method enters data in WorkBook object.
	 * 
	 * @param sheet
	 * @param sheetname
	 * @param tableName
	 * @param counter
	 * @param list
	 */
	private static void insertListInExcel(XSSFSheet sheet, String sheetName, String tableName, int rowCounter,
			List<Map<String, Object>> list) {
		int columnCounter = 0;
		rowCounter += 2;
		sheet.getRow(rowCounter).getCell(columnCounter).setCellValue(tableName);
		rowCounter++;

		// Inserting the column name of the table in ExcelSheet :
		for (Map.Entry<String, Object> entry : list.get(0).entrySet()) {
			sheet.getRow(rowCounter).getCell(columnCounter).setCellValue(entry.getKey());
			columnCounter++;
		}
		columnCounter = 0;
		rowCounter++;

		// Inserting the corresponding Values in ExcelSheet :
		for (Map<String, Object> map : list) {
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				sheet.getRow(rowCounter).getCell(columnCounter).setCellValue(entry.getValue().toString());
				columnCounter++;
			}
			columnCounter = 0;
			rowCounter++;
		}
		/*
		 * This might not work as Set will remove all common values, Need to check :
		 * 
		 * for(String columnName : list.get(0).keySet()) {
		 * sheet.getRow(rowCounter).getCell(columnCounter).setCellValue(columnName);
		 * columnCounter++; } rowCounter++; for(Map<String, Object> map : list) {
		 * for(Object columnValue : map.keySet()) {
		 * sheet.getRow(rowCounter).getCell(columnCounter).setCellValue(columnValue.
		 * toString()); columnCounter++; } rowCounter++; }
		 */
		updatingStaticCounter(sheetName, rowCounter);
	}

	
	/**
	 * Below method maps latest value of row pointer to static pointer of the
	 * corresponding sheet
	 * 
	 * @param sheetName
	 * @param rowCounter
	 */
	private static void updatingStaticCounter(String sheetName, int rowCounter) {
		switch (sheetName) {
		case "rds":
			rdsSheetRowCounter = rowCounter;
			break;
		case "bfs":
			bfsSheetRowCounter = rowCounter;
			break;
		case "map":
			mapSheetRowCounter = rowCounter;
			break;
		case "bcp":
			bcpSheetRowCounter = rowCounter;
			break;
		default:
			break;
		}

	}

	
	/**
	 * Below method closes Workbook and writes data into Excel
	 * 
	 * @author mohitgodara
	 */
	public static void closeWorkbook() {
		try {
			String filePath = System.getProperty("user.dir") + "/Evidence.xlsx";
			FileOutputStream fos = new FileOutputStream(new File(filePath));
			wb.write(fos);
			wb.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error occured while closing the workbook");
		}
	}

}
