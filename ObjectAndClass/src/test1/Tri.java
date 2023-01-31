package test1;
//속성 -> 세각, 세 변의 길이,색, 밑변 , 높이 / 행위->이동, 굴려, 넓이를 구해, 둘레를 구해....
public class Tri {
	int width; //안보여 캡슐화 시킴 외부에서 못보게
	int height;
	public double getArea() { //내가 갖고 있는 위드스와 헤이트로 매개변수x 토마토 기억
		double result = width*height*0.5;
		return result;
	}
}
