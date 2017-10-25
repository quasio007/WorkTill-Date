package newProgram;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(add(1,2));
//		System.out.println(add(1,2,3));
//		System.out.println(add(1.2,2));
//		System.out.println(add("hi","how are you?"));
//		int d = add(1,2);
		Main m=new Main();
		m.check();
	}
	
	
	public  void  check(){
		int d = add(1,2);
		System.out.println(d);
	}
	
	public  int add(int a, int b){
		System.out.println("int 2");
	return(a+b);	
	}
	
	public  int add(int a, int b, int c){
		System.out.println("int 3");
	return(a+b+c);	
	}
	
	public  double add(double a, double b){
		System.out.println("double 2");
	return(a+b);	
	}
	
	public  String add(String a, String b){
		System.out.println("String 2");
	return(a+" "+b);	
	}
}

//1st:
//Student Mohit;
//Mohit = new Student();
//Mohit.setName("Mohit");  
//Mohit.setAge(24);
//System.out.println(Mohit.getName() + " is " + Mohit.getAge() + " years old");

//2nd: