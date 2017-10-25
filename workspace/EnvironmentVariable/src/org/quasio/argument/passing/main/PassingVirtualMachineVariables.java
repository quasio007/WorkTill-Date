package org.quasio.argument.passing.main;

public class PassingVirtualMachineVariables {

	public static void main(String[] args) {
		System.out.println("Value of Variable is : '"+System.getProperty("test1")+"'");
		System.out.println("Value of Variable is : '"+System.getProperty("test2")+"'");
		System.setProperty("test3", "Sonia");
	
//		Property test1 and test2 passed through VM arguments are set in system property during the execution
//		Property test3 set using System.setProrety() methord is also set in system property during the execution
		UsingEnvironmentVariables.main(args);
	}

}
