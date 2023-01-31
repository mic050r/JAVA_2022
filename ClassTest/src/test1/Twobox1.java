package test1;
class Box1 {
	//멤버 변수
	int width;
	int	height;
	int depth;
	public Box1() {}
	public Box1(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public int getVolume() {
		return this.depth*this.height*this.width;
	}
}

public class Twobox1 {
	public static void main(String args[]) {
		Box1  b1 = new Box1(3,4,5);
		System.out.println("부피 : "+ b1.getVolume());
		
	}
}
