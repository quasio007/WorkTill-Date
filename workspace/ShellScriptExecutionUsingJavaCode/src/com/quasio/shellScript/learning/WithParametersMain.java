package com.quasio.shellScript.learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public class WithParametersMain {

	public static void main(String[] args) throws Exception {
		System.out.println("Start");
		String cmd = System.getProperty("user.dir") + "/src/./addShellScript.sh";
		
//		Methord 1 ::
		/*
		ProcessBuilder pb = new ProcessBuilder(cmd);
		Process pr = pb.start();
		
//		Connecting to script:
		OutputStream out = pr.getOutputStream();
		PrintStream ps = new PrintStream(out); // To add data to the script 
		ps.println(2);
		ps.flush(); // Is very important to flush the reader after writing new values
		ps.println(5);
		ps.flush();
		*/
		
//		Methord 2 :
		Process pr =Runtime.getRuntime().exec(cmd);
		OutputStream out = pr.getOutputStream();
		PrintStream ps = new PrintStream(out); // To add data to the script 
		ps.println(2);
		ps.flush(); // Is very important to flush the reader after writing new values
		ps.println(5);
		ps.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line =null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		System.out.println("Exit Value : '"+pr.waitFor()+"'");
		System.out.println("End");
	}
	
	
	

}
