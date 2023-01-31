package staticTest;
/*연간 이자를 2%로 설정하라.
 * 정기예박 메서드(fixedDeposit)을 작성하고,
 * 기간(년)과 금액을 입력하면 이자를 더한 원금을 계산하라.
 */
class Account{
	private int period; //기간
	private int balance; //금액
	static double anual_interest = 0.05;
	public Account(int period, int balance) {
		this.balance = balance;
		this.period = period;
	}
	//public Account(){};
	public void fixedDeposit() {
		this.balance += (this.balance*Account.anual_interest*this.period);
		this.printAccount();
	}
	public void printAccount() {
		System.out.println(this.period + "년 후 예상 금액 : " + this.balance);
	}
}
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account(1, 500000);
		a.fixedDeposit();
		Account b = new Account(2, 10000000);
		b.fixedDeposit();
	}

}
