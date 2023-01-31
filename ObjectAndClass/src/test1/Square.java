package test1;

public class Square {
	
	int width;
	int height;
	
	public int getArea() {
		int result = width*height;
		return result;
	}
	public int getArea1() {
		int result = (width + height)*2;
		return result;
	}
}
