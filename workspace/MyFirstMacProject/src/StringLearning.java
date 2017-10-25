
public class StringLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str ="12- 123-1 23 4-   12345 ";
   System.out.println(str.startsWith("- ", 1));
		  String[] st = str.split("-");
		  for(String d : st){
			  System.out.println("'a"+d+"b'");
//			  System.out.println();
			  System.out.println("'a"+d.trim()+"b'");
			  System.out.println();
			  }
//		  String s = " h   i ";
//		  System.out.println("'a"+s+"b'");
//		  System.out.println("'a"+s.trim()+"b'");
		  
	}
	

}
