import java.util.Scanner;
public class Factorial{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("n을 입력하기 : ");
		int n = scan.nextInt();
        int result = 1;
		for(int i = 1; i <= n; i++){ //계산된 값에 또 곱하기
            result *= i;
		}
        System.out.print("n! = "+ result);
   	}
}