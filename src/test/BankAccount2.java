package test;

public class BankAccount2 {
		String ownerName;
		int accountNumber;
		float balance;
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public float getBalance() {
			return balance;
		}
		public void setBalance(float balance) {
			this.balance = balance;
		}
		public BankAccount2(String ownerName, int accountNumber) {
			super();
			this.ownerName = ownerName;
			this.accountNumber = accountNumber;
		}
		public BankAccount2(String ownerName, int accountNumber, float balance) {
			super();
			this.ownerName = ownerName;
			this.accountNumber = accountNumber;
			this.balance = balance;
		}
		
		public void deposit(float parseFloat) {
			// TODO Auto-generated method stub
			
		}
		
}
