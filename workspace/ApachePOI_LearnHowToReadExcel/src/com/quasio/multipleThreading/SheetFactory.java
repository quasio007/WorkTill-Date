//package com.quasio.multipleThreading;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//
//public class SheetFactory {
//
//	public static synchronized XSSFSheet getSheet(String sheetName) {
//		switch (sheetName) {
//		case "id":
//			return ExcelWorkBook.getIdSheet();
//		case "name":
//			return ExcelWorkBook.getNameSheet();
//		case "address":
//			return ExcelWorkBook.getAddressSheet();
//		case "phoneNo":
//			return ExcelWorkBook.getPhoneNoSheet();
//		default:
//			System.out.println("No sheet present with required name like '"+sheetName+"'");
//			return null;
//		}
//		
//	}
//}
