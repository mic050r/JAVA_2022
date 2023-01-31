package Inheritance;
class A {
	public void show() {
		System.out.println("내용무");
	}
	public void show(String name) {
		System.out.println(name);
	}
	public void show(String name, int number) { //오버로딩 매개변수의 갯수에 따라 개념이 바뀐다.
		System.out.println(name + " " + number);
	}
}
public class OverLoading {

	public static void main(String[] args) {

		A a1 = new A();
		a1.show("나미림", 1120);
	}

}
