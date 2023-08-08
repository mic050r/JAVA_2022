import java.util.Scanner;
public class FlagSuml{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("n을 입력하기 : ");
		int n = scan.nextInt();
		int sum = 0;
      int total = 0;
		for(int i = 1; i <= n; i+=2){
         sum+= i;
         total += sum;
		}
		System.out.print(total);
   	}
}