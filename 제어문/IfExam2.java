import java.util.Scanner;
public class IfExam2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("연산자를 입력하세요 : ");
		int a = 20, b =10; 
		String op = scan.next();
		if(op.equals("+")) {
			System.out.println( a+"+"+b+"="+(a+b));
		}else if(op.equals("-")) {
			System.out.println( a+"-"+b+"="+(a-b)); 
		}else if(op.equals("*")) {
			System.out.println( a+"*"+b+"="+(a*b));
		}else if(op.equals("/")) {
			System.out.println( a+"/"+b+"="+(a/b));
		}else{
			System.out.println("사칙연산자가 아닙니다.");
		}
	
	}
}