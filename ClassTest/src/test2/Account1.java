package test2;

class Account{
	private int accountNumber; 
	private int balance = 0; 
	
	public void Account() {}
	public void Account(int accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int depositAmount) {
		this.balance += depositAmount;
	}
	public void withdraw(int withdrawAmount) {
		if(this.balance >= withdrawAmount) {
			this.balance -= withdrawAmount;
		}else {
			System.out.println("출금이 불가능 합니다. 잔액부족...");
		}
		this.printMyAccount(); 
	}
	public void printMyAccount() {
		System.out.println("============");
		System.out.println("계좌번호 : " + this.accountNumber);
		System.out.println("잔      액 : " + this.balance);
	}
	
}

public class Account1 {
	public static void main(String args[]) {
		Account a1 =  new Account(111,1111);
		a1.printMyAccount();
		Account a2 = new Account(123, 500000);
		a2.printMyAccount();
		a2.withdraw(100000);
		a1.deposit(10);
	}
}
