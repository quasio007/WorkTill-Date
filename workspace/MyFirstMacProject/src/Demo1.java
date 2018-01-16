import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
	public Demo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		File file = new File("./src/resources/file.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		StringBuilder sb = new StringBuilder();
		
		String line = "";
		while((line = br.readLine())!=null) {
			sb.append(line+"\n");
		}
		br.close();
		String text = sb.toString();
		System.out.println(text);
		System.out.println("------");
		
		text =text.replaceAll("\n", " ");
		System.out.println(text);
		String[] arr = text.split(" ");
		System.out.println(arr.length+"\n");
		
		
		
		Pattern p = Pattern.compile("[a-zA-Z]+");
		
		
		for(String s : arr) {
			Matcher m = p.matcher(s);
			if(m.matches()) {
				System.out.println(s);
			}
		}
		
	


	}
}
