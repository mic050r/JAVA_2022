package staticTest;
class Customer{
	private String id;
	private String password;
	private int socialNumber; //주민 번호
	static int cnt = 0; //인스턴트 객체 공유
	public Customer(String id, String password, int socialNumber) {
		this.id = id;
		this.password = password;
		this.socialNumber = socialNumber;
		cnt++;
	}
	public void printNumberOfCustomer() {
		System.out.println("회원 수 : "+ Customer.cnt);//static 변수는 클래스 이름으로 접근
	}
}
public class CustomersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer a = new Customer("aa", "aa",111);
		Customer b = new Customer("bb", "bb",222);
		Customer c = new Customer("cc", "cc",111);
		Customer d = new Customer("dd", "dd",111);
		Customer e = new Customer("ee", "ee",111);
		Customer f = new Customer("e", "aa",111);
		Customer g = new Customer("aa", "aa",111);
		Customer h = new Customer("aa", "aa",111);
		Customer i = new Customer("aa", "aa",111);
		Customer j = new Customer("aa", "aa",111);
		Customer k = new Customer("aa", "aa",111);
		c.printNumberOfCustomer();
		System.out.println(Customer.cnt);
	}

}
