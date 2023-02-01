package test1; //패키지 소속
//배열 선언, 생성(메모리 할당), 초기화
public class AarryTest1 {

	public static void main(String[] args) {
		//1. 선언 (정수 a 5)
		int [] a;
		//2. 생성
		a =new int[5]; System.out.println(a.length);
		//1+2
		double [] b = new double[3]; System.out.println(b.length);
		char [] c = new char [3]; System.out.println(c.length);
		String [] d = new String[2]; System.out.println(d.length);
		boolean [] e = new boolean[5]; System.out.println(e.length);
	}

}
