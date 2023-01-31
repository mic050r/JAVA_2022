package test1;
class Box {
	//멤버 변수
	int width;
	int	height;
	int depth;
}

public class Twobox {
	public static void main(String args[]) {
		Box  b1 = new Box();
		b1.width = 3;
		b1.height = 4;
		b1.depth = 5;
		System.out.println("부피 : "+ (b1.width*b1.height*b1.depth));
		
	}
}
