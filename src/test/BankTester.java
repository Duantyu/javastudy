package test;

class BankAccount {  //Ĭ�Ϲ��췽���������������ֵΪ�ջ���
	String ownerName;
	int accountNumber;
	float balance;  
}

public class BankTester {
	public static void main(String args[]) {
		BankAccount myAccount = new BankAccount();  //newһ��BankAccount���󣬵���BankAccount���췽��
		System.out.println("ownerName = " + myAccount.ownerName);
		System.out.println("accountNumber = " + myAccount.accountNumber);
		System.out.println("balance = " + myAccount.balance);
	}
}
 