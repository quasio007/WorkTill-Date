package com.quasio.multipleThreading;

import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UsingMultipleThreading {

	public static void main(String[] args) throws Exception {
		System.out.println("Start");
		String filePath = System.getProperty("user.dir") + "/Evidence.xlsx";
		FileOutputStream fos = new FileOutputStream(new File(filePath));

		XSSFWorkbook wb = new XSSFWorkbook();
		wb.createSheet("RDS");
		wb.createSheet("BFS");
		wb.createSheet("MAP");
		wb.createSheet("BCP");

		ExecutorService executor =Executors.newCachedThreadPool();
		XSSFSheet rdsSheet = wb.getSheet("RDS");
		rdsSheet.createRow(0).createCell(0).setCellValue("Setting in RDS");
		executor.submit(new Runnable() {
			
			@Override
			public void run() {
			 for(int i =1; i<999; i++) {
				 if(i<100) {
					 rdsSheet.createRow(i).createCell(0).setCellValue(i);
				 }else if(i<200) {
					 rdsSheet.createRow(i-99).createCell(1).setCellValue(i);
				 }
				 else if(i<300) {
					 
					 rdsSheet.createRow(i-199).createCell(2).setCellValue(i);
				 }else if(i<400) {
					 rdsSheet.createRow(i-299).createCell(3).setCellValue(i);
				 }else if(i<500) {
					 rdsSheet.createRow(i-399).createCell(4).setCellValue(i);
				 }else if(i<600) {
					 rdsSheet.createRow(i-499).createCell(5).setCellValue(i);
				 }else if(i<700) {
					 rdsSheet.createRow(i-599).createCell(6).setCellValue(i);
				 }else if(i<800) {
					 rdsSheet.createRow(i-699).createCell(7).setCellValue(i);
				 }else if(i<900) {
					 rdsSheet.createRow(i-799).createCell(8).setCellValue(i);
				 }else if(i<1000) {
					 rdsSheet.createRow(i-899).createCell(9).setCellValue(i);
				 }
			 }
				
			}
		});
		

		XSSFSheet bfsSheet = wb.getSheet("BFS");
		bfsSheet.createRow(0).createCell(0).setCellValue("Setting in BFS");
		executor.submit(new Runnable() {
			
			@Override
			public void run() {
			 for(int i =1; i<100; i++)
				 bfsSheet.createRow(i).createCell(0).setCellValue("Name-"+i);
				
			}
		});
		

		XSSFSheet mapSheet = wb.getSheet("MAP");
		mapSheet.createRow(0).createCell(0).setCellValue("Setting in MAP");
		executor.submit(new Runnable() {
			
			@Override
			public void run() {
			 for(int i =1; i<100; i++)
				 mapSheet.createRow(i).createCell(0).setCellValue("Address-"+i);
				
			}
		});

		XSSFSheet bcpSheet = wb.getSheet("BCP");
		bcpSheet.createRow(0).createCell(0).setCellValue("Setting in BCP");
		executor.submit(new Runnable() {
			
			@Override
			public void run() {
			 for(int i =1; i<100; i++)
				 bcpSheet.createRow(i).createCell(0).setCellValue("PhoneNo:912-"+i);
				
			}
		});

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);
		wb.write(fos);
		wb.close();
		fos.close();
		System.out.println("End");
	}

}
