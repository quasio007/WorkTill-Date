package read.or.output;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

public class ReadingFile {

	public static void main(String[] args) throws Exception {
		String src = "//Users//mohitgodara//Documents//TestData//file.txt";

		File file = new File(src);
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		String line;
		while(( line = br.readLine()) !=null){
			System.out.println(line);
		}
		br.close();

	}

}
