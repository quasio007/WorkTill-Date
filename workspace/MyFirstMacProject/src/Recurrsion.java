
public class Recurrsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4;
System.out.println(power(n));
	}
static int power(int n){
if(n==0){
	return 1;
}	else if(n%2==0){
	return power(n/2)*power(n/2);
}else{
	return 4*power(n-1);
}
}
}
