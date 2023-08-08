import java.util.Scanner;
public class SwitchExam1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("학과 입력 : ");
		int major = scan.nextInt();	
		//1:소프트 3. 웹솔 3. 디자인
		switch(major) {
			case 1: System.out.println("뉴미디어소프트웨어과"); break;
			case 2: System.out.println("뉴미디어웹솔루션과"); break;
			case 3 :System.out.println("뉴미디어디자인과"); break;
			default: System.out.println("잘못된 입력입니다."); 
		}


	}
}