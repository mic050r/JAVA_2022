package Inheritance;
class C{ //부모
	public void show() {
		System.out.println("나는 부모야");
	}
}
class B extends C{ // B는 C의 자식
	//public void show() {
	//	System.out.println("No 나는 자식이야"); //재정의하면 다르게 나옴
	//}
}
public class OverridingTest {

	public static void main(String[] args) {
		B b1 =  new B();
		b1.show();
	}

}
