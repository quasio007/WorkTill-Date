
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a,b;
//a=(Integer) null;
		System.out.println("In Main");
System.out.println(doIt());
System.out.println("In main after doIt");
	}
	@SuppressWarnings("finally")
	static int doIt(){
		
		try{
			System.out.println("in try");
			double r =100/2;
			System.out.println(r);
			System.out.println("in try again");
//			System.exit(1);
			return 10;
		}catch (Exception e) {
			System.out.println("in catch");
			System.out.println(e);
			System.out.println("in catch again");
			return 50;
			}
		finally{
			System.out.println("in finally");
			return 20;
		}
	}

}
