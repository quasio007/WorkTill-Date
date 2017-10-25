package abstrac.learning;

public class Bank1 extends Bank{

	
	@Override
	public int getRate() {
		
		return 12;
	}
	
	public int getRate2(){
		return 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b = new Bank1();

System.out.println(b.getRate1());
	}

}
