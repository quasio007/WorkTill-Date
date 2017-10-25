package date.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d1 =new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("E MM/dd/yyyy HH-mm-ss");
		String d2 =sdf.format(d1);
		System.out.println(d2);
		
	}

}
