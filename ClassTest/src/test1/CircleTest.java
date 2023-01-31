package test1;
class Circle{
	private int r;
	final double PI = 3.14;
	//생성자 메서드 오버로딩
	public Circle() {} //매개변수 X => jvm이 삽입가능
	//컴파일러 할 때 알아서 만들어줌 생성자 메소드
	public Circle(int r) { //매개변수 1
		this.r = r;
	}
	public double getArea() {
		return r*this.r*PI;
	}
	public void setRadius() {
		this.r = this.r*2;
	}
	public double getRound() {
		return this.r*2*PI;
	}
}


public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		c1.setRadius(); //r = 10
		
		System.out.println(c1.getArea());
		System.out.println(c1.getRound());
	}

}
