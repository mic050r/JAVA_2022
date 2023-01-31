package test1;
import java.util.Scanner;
class Account{
	private int anum; //은행계좌번호
	private int money = 0; //잔액
	//입금 메서드, 출금 메서드, 조회 메서드
	//생성자 메서드 -> 계좌 번호, 잔액
	public Account() {}
		
	public int getAnum() {
		return anum;
	}

	public void setAnum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("계좌번호를 입력하세요 : ");
		this.anum = sc.nextInt();
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금값 : ");
		int depositMoney = sc.nextInt();
		this.money += depositMoney;
	}
	
	public void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출금값 : ");
		int withdrawMoney = sc.nextInt();
		if(withdrawMoney > this.money) {
			System.out.println("잔액이 부족합니다.");
		}
		else {
			this.money -= withdrawMoney;
		}
	}
}

public class AccountTeset {
	public static void main(String args[]) {
		Account a1 = new Account();
		
		a1.setAnum();
		a1.deposit();
		a1.withdraw();
		
		System.out.println("현재 계좌 번호 : " + a1.getAnum());
		System.out.println("현재 계좌 잔액 : " + a1.getMoney());
	}
}
