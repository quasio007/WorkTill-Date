

import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UsingMultipleThreading2 {

	private static XSSFSheet rdsSheet;
	private static XSSFSheet bfsSheet;
	private static XSSFSheet mapSheet;
	private static XSSFSheet bcpSheet;

	public static void main(String[] args) throws Exception {
		System.out.println("Start");
		long startTime = System.currentTimeMillis();
		
		String filePath = System.getProperty("user.dir") + "/Evidence.xlsx";
		FileOutputStream fos = new FileOutputStream(new File(filePath));

		XSSFWorkbook wb = new XSSFWorkbook();
		rdsSheet = wb.createSheet("Start");
		bfsSheet = wb.createSheet("PhoneNo");
		mapSheet = wb.createSheet("Address");
		bcpSheet = wb.createSheet("Name");
		for (int i = 0; i < 150; i++) {
			rdsSheet.createRow(i);
			bfsSheet.createRow(i);
			mapSheet.createRow(i);
			bcpSheet.createRow(i);
			for (int j = 0; j < 150; j++) {
				rdsSheet.getRow(i).createCell(j);
				bfsSheet.getRow(i).createCell(j);
				mapSheet.getRow(i).createCell(j);
				bcpSheet.getRow(i).createCell(j);
			}
		}

		rdsSheet.getRow(0).getCell(0).setCellValue("Setting in RDS");
		bfsSheet.getRow(0).getCell(0).setCellValue("Setting in BFS");
		mapSheet.getRow(0).getCell(0).setCellValue("Setting in MAP");
		bcpSheet.getRow(0).getCell(0).setCellValue("Setting in BCP");

		ExecutorService executor = Executors.newCachedThreadPool();

		executor.submit(new Runnable() {
			
			public void run() {
				enterRdsData(rdsSheet);
				
			}
		});

		executor.submit(new Runnable() {
			
			public void run() {
				enterBfsData(bfsSheet);
			}
		});

		executor.submit(new Runnable() {

		
			public void run() {
				enterMapData(mapSheet);
			}
		});

		executor.submit(new Runnable() {

			
			public void run() {
				enterBcpData(bcpSheet);
			}
		});

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		wb.write(fos);
//		wb.close();
		fos.close();
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time taken : "+((endTime-startTime)/1000)+"sec");
		System.out.println("End");
	}

	protected static void enterBcpData(XSSFSheet sheet) {
		for (int i = 1; i < 1000; i++) {
			if (i >= 0 && i < 100) {
				sheet.getRow(i).getCell(0).setCellValue("Name-" + i);
				waitForSomeTime();
			} else if (i >= 100 && i < 200) {
				sheet.getRow(i - 99).getCell(1).setCellValue("Name-" + i);
				waitForSomeTime();
			} else if (i < 300) {
				sheet.getRow(i - 199).getCell(2).setCellValue("Name-" + i);
				waitForSomeTime();
			} else if (i < 400) {
				sheet.getRow(i - 299).getCell(3).setCellValue("Name-" + i);
				waitForSomeTime();
			} else if (i < 500) {
				sheet.getRow(i - 399).getCell(4).setCellValue("Name-" + i);
				waitForSomeTime();
			} else if (i < 600) {
				sheet.getRow(i - 499).getCell(5).setCellValue("Name-" + i);
				waitForSomeTime();
			} else if (i < 700) {
				sheet.getRow(i - 599).getCell(6).setCellValue("Name-" + i);
				waitForSomeTime();
			} else if (i < 800) {
				sheet.getRow(i - 699).getCell(7).setCellValue("Name-" + i);
				waitForSomeTime();
			} else if (i < 900) {
				sheet.getRow(i - 799).getCell(8).setCellValue("Name-" + i);
				waitForSomeTime();
			} else if (i < 1000) {
				sheet.getRow(i - 899).getCell(9).setCellValue("Name-" + i);
				waitForSomeTime();
			}
		}

	}


	protected static void enterMapData(XSSFSheet sheet) {
		for (int i = 1; i < 1000; i++) {
			if (i >= 0 && i < 100) {
				sheet.getRow(i).getCell(0).setCellValue("Address-" + i);
				waitForSomeTime();
			} else if (i >= 100 && i < 200) {
				sheet.getRow(i - 99).getCell(1).setCellValue("Address-" + i);
				waitForSomeTime();
			} else if (i < 300) {
				sheet.getRow(i - 199).getCell(2).setCellValue("Address-" + i);
				waitForSomeTime();
			} else if (i < 400) {
				sheet.getRow(i - 299).getCell(3).setCellValue("Address-" + i);
				waitForSomeTime();
			} else if (i < 500) {
				sheet.getRow(i - 399).getCell(4).setCellValue("Address-" + i);
				waitForSomeTime();
			} else if (i < 600) {
				sheet.getRow(i - 499).getCell(5).setCellValue("Address-" + i);
				waitForSomeTime();
			} else if (i < 700) {
				sheet.getRow(i - 599).getCell(6).setCellValue("Address-" + i);
				waitForSomeTime();
			} else if (i < 800) {
				sheet.getRow(i - 699).getCell(7).setCellValue("Address-" + i);
				waitForSomeTime();
			} else if (i < 900) {
				sheet.getRow(i - 799).getCell(8).setCellValue("Address-" + i);
				waitForSomeTime();
			} else if (i < 1000) {
				sheet.getRow(i - 899).getCell(9).setCellValue("Address-" + i);
				waitForSomeTime();
			}
		}

	}

	protected static void enterBfsData(XSSFSheet sheet) {
		for (int i = 1; i < 1000; i++) {
			if (i >= 0 && i < 100) {
				sheet.getRow(i).getCell(0).setCellValue("PhoneNoOfThePerson-" + i);
				waitForSomeTime();
			} else if (i >= 100 && i < 200) {
				sheet.getRow(i - 99).getCell(1).setCellValue("PhoneNoOfThePerson-" + i);
				waitForSomeTime();
			} else if (i < 300) {
				sheet.getRow(i - 199).getCell(2).setCellValue("PhoneNoOfThePerson-" + i);
				waitForSomeTime();
			} else if (i < 400) {
				sheet.getRow(i - 299).getCell(3).setCellValue("PhoneNoOfThePerson-" + i);
				waitForSomeTime();
			} else if (i < 500) {
				sheet.getRow(i - 399).getCell(4).setCellValue("PhoneNoOfThePerson-" + i);
				waitForSomeTime();
			} else if (i < 600) {
				sheet.getRow(i - 499).getCell(5).setCellValue("PhoneNoOfThePerson-" + i);
				waitForSomeTime();
			} else if (i < 700) {
				sheet.getRow(i - 599).getCell(6).setCellValue("PhoneNoOfThePerson-" + i);
				waitForSomeTime();
			} else if (i < 800) {
				sheet.getRow(i - 699).getCell(7).setCellValue("PhoneNoOfThePerson-" + i);
				waitForSomeTime();
			} else if (i < 900) {
				sheet.getRow(i - 799).getCell(8).setCellValue("PhoneNoOfThePerson-" + i);
				waitForSomeTime();
			} else if (i < 1000) {
				sheet.getRow(i - 899).getCell(9).setCellValue("PhoneNoOfThePerson-" + i);
				waitForSomeTime();
			}
		}

	}

	protected static void enterRdsData(XSSFSheet sheet) {

		for (int i = 1; i < 1000; i++) {
			if (i >= 0 && i < 100) {
				sheet.getRow(i).getCell(0).setCellValue(i);
				waitForSomeTime();
			} else if (i >= 100 && i < 200) {
				sheet.getRow(i - 99).getCell(1).setCellValue(i);
				waitForSomeTime();
			} else if (i < 300) {
				sheet.getRow(i - 199).getCell(2).setCellValue(i);
				waitForSomeTime();
			} else if (i < 400) {
				sheet.getRow(i - 299).getCell(3).setCellValue(i);
				waitForSomeTime();
			} else if (i < 500) {
				sheet.getRow(i - 399).getCell(4).setCellValue(i);
				waitForSomeTime();
			} else if (i < 600) {
				sheet.getRow(i - 499).getCell(5).setCellValue(i);
				waitForSomeTime();
			} else if (i < 700) {
				sheet.getRow(i - 599).getCell(6).setCellValue(i);
				waitForSomeTime();
			} else if (i < 800) {
				sheet.getRow(i - 699).getCell(7).setCellValue(i);
				waitForSomeTime();
			} else if (i < 900) {
				sheet.getRow(i - 799).getCell(8).setCellValue(i);
				waitForSomeTime();
			} else if (i < 1000) {
				sheet.getRow(i - 899).getCell(9).setCellValue(i);
				waitForSomeTime();
			}
		}

	}

	private static void waitForSomeTime() {
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			System.out.println("Error thrown ");
		}
		
	}

}
