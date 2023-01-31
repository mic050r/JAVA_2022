package test1;

public class TriTest {

	public static void main(String[] args) {
		Tri t1 = new Tri();
		t1.height = 5;
		t1.width = 3;
		System.out.println("삼각형의 면적 : " + t1.getArea());
		
		Tri t2 = new Tri();
		t2.height = 10;
		t2.width = 7;
		System.out.println("삼각형의 면적 : " + t2.getArea());
	}

}
