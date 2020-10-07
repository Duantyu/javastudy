package test;

class BankAccount {  //默认构造方法，各个域的属性值为空或零
	String ownerName;
	int accountNumber;
	float balance;  
}

public class BankTester {
	public static void main(String args[]) {
		BankAccount myAccount = new BankAccount();  //new一个BankAccount对象，调用BankAccount构造方法
		System.out.println("ownerName = " + myAccount.ownerName);
		System.out.println("accountNumber = " + myAccount.accountNumber);
		System.out.println("balance = " + myAccount.balance);
	}
}
 