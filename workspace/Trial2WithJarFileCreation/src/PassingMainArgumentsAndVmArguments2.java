

import java.io.InputStream;
import java.util.Properties;

public class PassingMainArgumentsAndVmArguments2 {

	public static void main(String[] args) throws Exception {
		System.out.println("\n");
//		Checking for Main arguments passed :
		System.out.println("Checking for Main arguments passed :");
		int index = 0;
		System.out.println("Array size : '"+args.length+"'");
		for(String str :args) {
			System.out.println("args["+index+"] ="+str);
			index += 1;
		}
		System.out.println(" \n");
		
//		Checking for VM arguments passed :
		System.out.println("Checking for VM arguments passed :");
		System.out.println("Value of Variable is : '"+System.getProperty("test1")+"'");
		System.out.println("Value of Variable is : '"+System.getProperty("test2")+"'");
		
//		Setting a new property :
		System.out.println("\n System properties :");
		System.setProperty("test3", "Sonia");
		Properties properties =System.getProperties();
		System.out.println(properties);
		
		System.out.println("\n");
		
		String location =System.getProperty("user.dir");
		System.out.println("Project location : '"+location+"'");
		
//		Reading Values from property files in Project folder: 
		System.out.println("Reading Values from property files in Project folder:");
		String fileName = String.format("%s.properties", System.getProperty("prop"));
		System.out.println("FileName : '"+fileName+"'");
		InputStream is =PassingMainArgumentsAndVmArguments2.class.getResourceAsStream("/"+fileName);
		
		Properties prop = new Properties();
		prop.load(is);
		String name = prop.getProperty("name");
		System.out.println("Property picked from file : '"+name+".properties' file");
		
		System.out.println("\n");
		
//		Reading Data from a property file in src folder :
//		System.out.println("Reading Data from a property file in src folder :");
//		Properties prop1 = new Properties();
//		prop1.load(new FileInputStream("./src/c.properties"));
//		String name1 = prop1.getProperty("name");
//		System.out.println("Name1 : '"+name1+"'");
		
	}

}
