package org.quasio.argument.passing.main;

import java.util.Map;
import java.util.Properties;

/**
 * A demo class of how to read  Environment variables :
 * @author mohitgodara
 *
 */
public class UsingEnvironmentVariables {

/**
 * Function for getting Environment Key Value pair
 */
	public static void getEnvironmentVariableswithValues() {
		Map<String,String> map =System.getenv();
		System.out.println("Environment Key Value pair are as follows : \n ");
		
		for(Map.Entry<String,String> entry : map.entrySet()) {
			System.out.println(""+entry.getKey()+" : "+entry.getValue()+"");
		}
		
	}
	 
		public static void main(String[] args) {
			Properties properties =System.getProperties();
			System.out.println(properties);
			System.out.println();
			getEnvironmentVariableswithValues();

			}

}
