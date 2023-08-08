/*키보드로부터 나이, 성별(남:0,여:1) 입력받아
나이가 19세 미만이고 여성인 경우 입장권을 20%할인
이때 입장권 금액 = 50000원, 반드시 상수 선언, 논리, 산술연자, if*/
import java.util.Scanner;
public class Logical2{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in); 	
		final int M =50000;	
		int result = (int)(M*0.8);
		System.out.print("성별을 입력하시오(남:0,여:1) : ");
		int sex = scan.nextInt();
		System.out.print("나이를 입력하시오 : ");
		int age = scan.nextInt();
			if((age<19)&&(sex==1)){ 
				System.out.print("입장권 금액은 " + result+"원 입니다.");
			}else{
				System.out.print("입장권 금액은 " + M +"원 입니다.");
			}
	}
}