package com.quasio.multipleThreading;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWorkBook_BackUp {
	/**
	 * It's a Wrapper class over Excel Sheet 
	 * to make it thread safe.
	 * @author mohitgodara
	 */

	private static XSSFWorkbook wb;
	private XSSFSheet id;
	private XSSFSheet phoneNo;
	private XSSFSheet address;
	private XSSFSheet name;
	private static final ExcelWorkBook_BackUp workBook = new ExcelWorkBook_BackUp();

	private ExcelWorkBook_BackUp() {
		wb = new XSSFWorkbook();
		
//		Creating different sheets in the workbook :
		id = wb.createSheet("Id");
		name = wb.createSheet("Name");
		phoneNo = wb.createSheet("PhoneNo");
		address = wb.createSheet("Address");
		
//		Creating blank cells in all sheets of the workbook :
		for (int i = 0; i < 150; i++) {
			id.createRow(i);
			name.createRow(i);
			phoneNo.createRow(i);
			address.createRow(i);
			for (int j = 0; j < 100; j++) {
				id.getRow(i).createCell(j);
				name.getRow(i).createCell(j);
				phoneNo.getRow(i).createCell(j);
				address.getRow(i).createCell(j);
			}
		}
		
//		Setting the first column of each sheet :
		id.getRow(0).getCell(0).setCellValue("ID");
		name.getRow(0).getCell(0).setCellValue("Name");
		phoneNo.getRow(0).getCell(0).setCellValue("PhoneNo");
		address.getRow(0).getCell(0).setCellValue("Address");
		
	}

	private static ExcelWorkBook_BackUp getInstance() {
		return workBook;
	}

	public static XSSFSheet getIdSheet() {
		return getInstance().id;
	}
	
	public static XSSFSheet getNameSheet() {
		return getInstance().name;
	}

	public static XSSFSheet getPhoneNoSheet() {
		return getInstance().phoneNo;
	}

	public static XSSFSheet getAddressSheet() {
		return getInstance().address;
	}
	
	protected static synchronized void enterDataInExcel(String sheetName) {
		XSSFSheet sheet = null;
		switch (sheetName) {
		case "id":
			 sheet = getIdSheet();
				for (int i = 1; i < 1000; i++) {
					if (i >= 0 && i < 100) {
						sheet.getRow(i).getCell(0).setCellValue(i);
					} else if (i >= 100 && i < 200) {
						sheet.getRow(i - 99).getCell(1).setCellValue(i);
					} else if (i < 300) {
						sheet.getRow(i - 199).getCell(2).setCellValue(i);
					} else if (i < 400) {
						sheet.getRow(i - 299).getCell(3).setCellValue(i);
					} else if (i < 500) {
						sheet.getRow(i - 399).getCell(4).setCellValue(i);
					} else if (i < 600) {
						sheet.getRow(i - 499).getCell(5).setCellValue(i);
					} else if (i < 700) {
						sheet.getRow(i - 599).getCell(6).setCellValue(i);
					} else if (i < 800) {
						sheet.getRow(i - 699).getCell(7).setCellValue(i);
					} else if (i < 900) {
						sheet.getRow(i - 799).getCell(8).setCellValue(i);
					} else if (i < 1000) {
						sheet.getRow(i - 899).getCell(9).setCellValue(i);
						
					}
				}
		case "name":
			sheet = getNameSheet();
			for (int i = 1; i < 1000; i++) {
				if (i >= 0 && i < 100) {
					sheet.getRow(i).getCell(0).setCellValue("Name-" + i);
				} else if (i >= 100 && i < 200) {
					sheet.getRow(i - 99).getCell(1).setCellValue("Name-" + i);
				} else if (i < 300) {
					sheet.getRow(i - 199).getCell(2).setCellValue("Name-" + i);
				} else if (i < 400) {
					sheet.getRow(i - 299).getCell(3).setCellValue("Name-" + i);
				} else if (i < 500) {
					sheet.getRow(i - 399).getCell(4).setCellValue("Name-" + i);
				} else if (i < 600) {
					sheet.getRow(i - 499).getCell(5).setCellValue("Name-" + i);
				} else if (i < 700) {
					sheet.getRow(i - 599).getCell(6).setCellValue("Name-" + i);
				} else if (i < 800) {
					sheet.getRow(i - 699).getCell(7).setCellValue("Name-" + i);
				} else if (i < 900) {
					sheet.getRow(i - 799).getCell(8).setCellValue("Name-" + i);
				} else if (i < 1000) {
					sheet.getRow(i - 899).getCell(9).setCellValue("Name-" + i);
					
				}
			}
			break;
		case "address":
			sheet = getAddressSheet();
			for (int i = 1; i < 1000; i++) {
				if (i >= 0 && i < 100) {
					sheet.getRow(i).getCell(0).setCellValue("Address-" + i);
				} else if (i >= 100 && i < 200) {
					sheet.getRow(i - 99).getCell(1).setCellValue("Address-" + i);
				} else if (i < 300) {
					sheet.getRow(i - 199).getCell(2).setCellValue("Address-" + i);
				} else if (i < 400) {
					sheet.getRow(i - 299).getCell(3).setCellValue("Address-" + i);
				} else if (i < 500) {
					sheet.getRow(i - 399).getCell(4).setCellValue("Address-" + i);
				} else if (i < 600) {
					sheet.getRow(i - 499).getCell(5).setCellValue("Address-" + i);
				} else if (i < 700) {
					sheet.getRow(i - 599).getCell(6).setCellValue("Address-" + i);
				} else if (i < 800) {
					sheet.getRow(i - 699).getCell(7).setCellValue("Address-" + i);
				} else if (i < 900) {
					sheet.getRow(i - 799).getCell(8).setCellValue("Address-" + i);
				} else if (i < 1000) {
					sheet.getRow(i - 899).getCell(9).setCellValue("Address-" + i);
				}
			}
			break;
		case "phoneNo":
			sheet = getPhoneNoSheet();
			for (int i = 1; i < 1000; i++) {
				if (i >= 0 && i < 100) {
					sheet.getRow(i).getCell(0).setCellValue("PhoneNoOfThePerson-" + i);
				} else if (i >= 100 && i < 200) {
					sheet.getRow(i - 99).getCell(1).setCellValue("PhoneNoOfThePerson-" + i);
				} else if (i < 300) {
					sheet.getRow(i - 199).getCell(2).setCellValue("PhoneNoOfThePerson-" + i);
				} else if (i < 400) {
					sheet.getRow(i - 299).getCell(3).setCellValue("PhoneNoOfThePerson-" + i);
				} else if (i < 500) {
					sheet.getRow(i - 399).getCell(4).setCellValue("PhoneNoOfThePerson-" + i);
				} else if (i < 600) {
					sheet.getRow(i - 499).getCell(5).setCellValue("PhoneNoOfThePerson-" + i);
				} else if (i < 700) {
					sheet.getRow(i - 599).getCell(6).setCellValue("PhoneNoOfThePerson-" + i);
				} else if (i < 800) {
					sheet.getRow(i - 699).getCell(7).setCellValue("PhoneNoOfThePerson-" + i);
				} else if (i < 900) {
					sheet.getRow(i - 799).getCell(8).setCellValue("PhoneNoOfThePerson-" + i);
				} else if (i < 1000) {
					sheet.getRow(i - 899).getCell(9).setCellValue("PhoneNoOfThePerson-" + i);
					
				}
			}
			break;
		default:
			System.out.println("No sheet present with required name like '"+sheetName+"'");
		}
	}

	/**
	 * Below methord closes Workbook and 
	 * writes data into Excel
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
