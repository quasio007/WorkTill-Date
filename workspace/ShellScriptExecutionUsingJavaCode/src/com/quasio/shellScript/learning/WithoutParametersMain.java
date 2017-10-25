package com.quasio.shellScript.learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WithoutParametersMain {

	public static void main(String[] args) throws Exception {
		System.out.println("Start");
		
//		Methord 1 ::
//		String path = System.getProperty("user.dir") + "/src/shellScript.sh";
//		Process pr =Runtime.getRuntime().exec("bash "+path);
		
		
//		Passing 3 arguments with shell script:
		String cmd = System.getProperty("user.dir") + "/src/./basicShellScript.sh Mohit Is Awesome";
		Process pr =Runtime.getRuntime().exec(cmd);

		BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		
		String line =null;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		System.out.println("Exit Value : '"+pr.waitFor()+"'");
		System.out.println("End");
	}
	
	
	

}
