package test1;

public class SquareTest {

	public static void main(String[] args) {
		
		Square s1 = new Square();
		s1.height = 5;
		s1.width = 17;
		
		System.out.println("사각형의 둘레 : " + s1.getArea1());
		System.out.println("사각형의 넓이 : " + s1.getArea());
	}

}
