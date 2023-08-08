import java.util.Scanner;
	public class Absolute_test{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int ess = sc.nextInt();
			int asl = ess*(-1);
			int result = (ess<0) ? asl : ess;
			System.out.print(ess+"의 절대값은 " + result +"입니다");
	}
}