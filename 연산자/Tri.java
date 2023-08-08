//if~else~ == 삼항연산자 코드가 길어지면 if,else 삼항 연산자는 가동성이 떨어짐 BUT 짧은건 ㄱㅊ
public class Tri{
	public static void main(String args[]){
		int a = 5;
		int b = 7;
		int c;
		c = (a>b)? a:b;
		System.out.println(c);
	}
}