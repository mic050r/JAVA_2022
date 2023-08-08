/*키보드로부터 나이, 성별(남:0,여:1) 입력받아
나이가 19세 미만이고 여성인 경우 입장권을 20%할인
이때 입장권 금액 = 50000원, 반드시 상수 선언, 논리, 산술연자, if*/
import java.util.Scanner;
public class Logical2{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in); 		
		int sex = scan.nextInt();
		if(sex==0){
			System.out.println("남자");
		}else if(sex==1){
			System.out.println("여자");
		}

		

	}
}