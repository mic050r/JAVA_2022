package test2;
class Account{
	private int accountNumber; //은행계좌번호
	private int balance = 0; //잔액
	//입금 메서드, 출금 메서드, 조회 메서드
	//생성자 메서드 -> 계좌 번호, 잔액
	
	//생성자메소드
	public Account() {}
	public Account(int accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//setter, getter
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
	//일반메소드
	public void deposit(int depositAmount) {
		this.balance += depositAmount;
		//this.printMyAccount(); //바로 결과 나아고ㅔ
	}
	public void withdraw(int withdrawAmount) {
		if(this.balance >= withdrawAmount) {
			this.balance -= withdrawAmount;
		}else {
			System.out.println("출금불가!! 잔액부족!!");
		}
		//this.printMyAccount(); //바로 결과 나오게
	}
	@Override
	public String toString() {
		return "계좌 번호 : " + accountNumber + " ,잔액 " + balance ;
	}
	
	/*public void printMyAccount() {
		System.out.println("============");
		System.out.println("계좌번호 : " + this.accountNumber);
		System.out.println("잔      액 : " + this.balance);
	}*/
	
}
