package test1;
class Triangle{ //클래스 선언부
	private int width; //클래스 멤버
	private int height;
	public Triangle() {}
	public Triangle(int width, int height) { //width는 7줄로 height는 8로 생성자?
		this.width = width;
		this.height = height;
	}
}
public class Tryangle {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(5,6);
		Triangle t2 = new Triangle(10,8); //6wnffh 6줄로
	}

}
