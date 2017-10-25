package org.quasio.argument.passing.main;

public class PassingMainArguments {
public static void main(String[] args) {
	int index = 0;
	System.out.println("Start");
	System.out.println("Array size : '"+args.length+"'");
	for(String str :args) {
		System.out.println("args["+index+"] ="+str);
		index += 1;
	}
	System.out.println("Ends");
	
}
}
