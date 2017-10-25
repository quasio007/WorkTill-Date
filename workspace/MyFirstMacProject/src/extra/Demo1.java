package extra;

public class Demo1{
private static String str ;
	public static void main(String[] args) {
		Try t =new Try1();
		Try1 t1 =new Try1();
System.out.println(t.i);
System.out.println(t1.i);
System.out.println(t1.str);
	}

}
interface Try{
	static int i =2;
	String str ="Hello";
	Double d =2.3;
	
}
class Try1 implements Try{
	static int i =3;
}