import java.util.Scanner;
public class FlagSum{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("n을 입력하기 : ");
		int n = scan.nextInt();
		int j = 0;
		for(int i = 1; i <= n; i++){
			if((i%2) == 0){
				j = j-i;
			}
			else{
				j = j+i;
			}
		}
		System.out.print(j+"\t");
   	}
}