package com.quasio.multipleThreading;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class UsingMultipleThreading3 {

	public static void main(String[] args) throws Exception {
		System.out.println("Start");
		long startTime = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(4);

//		Each Thread should call a particular method , and method should do data fetching and then put the data in Excel using enterDataInExcel method
		executor.submit(() -> enterIDData());
//		executor.submit(() -> enterNameData());
//		executor.submit(() -> enterAddressData());
//		executor.submit(() -> enterPhoneNoData());

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		ExcelWorkBook.closeWorkbook();
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time taken : " + ((endTime - startTime) / 1000) + "sec");
		System.out.println("End");
	}
	
	protected static void enterIDData() {
		try {
			ExcelWorkBook.enterDataInExcel("id", "",new ArrayList<>());
		} catch (NoSheetPresentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	protected static void enterNameData() {
//		ExcelWorkBook.enterDataInExcel("name");
//	}
//
//	protected static void enterAddressData() {
//		ExcelWorkBook.enterDataInExcel("address");
//	}
//
//	protected static void enterPhoneNoData() {
//		ExcelWorkBook.enterDataInExcel("phoneNo");
//	}


}
