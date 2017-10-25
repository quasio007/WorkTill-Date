package write.or.input;

import java.io.File;

import java.io.PrintWriter;

public class WritingIntoAFile {
public static void main(String[] args) throws Exception {
	String src ="//Users//mohitgodara//Documents//TestData//file.txt";

	File file =new File(src);
	System.out.println(file.exists());
	System.out.println(file.createNewFile());
	System.out.println(file.exists());
	PrintWriter pw =new PrintWriter(file);
   
		pw.println("Hello World");
		pw.println(12);
		pw.println("God Bless animals");
		pw.close();
	System.out.println("Done");
	
	
}
}
