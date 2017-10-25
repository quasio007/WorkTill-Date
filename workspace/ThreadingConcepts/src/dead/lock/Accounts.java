package dead.lock;

public class Accounts {
private int balance =10000;

public void addBalance(int amount){
	balance += amount;
}
public void withdrawBalance(int amount){
	balance -= amount;
}
public int getBalance(){
	return this.balance ;
}
public  static void transferMoney(Accounts act1 ,Accounts act2 ,int amount){
	act1.withdrawBalance(amount);
	act2.addBalance(amount);
}
}
