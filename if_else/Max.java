import java.util.Scanner;
public class Max{
	public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.print("첫 번째 수 입력 : ");
			int n1 = sc.nextInt();

			System.out.print("두 번째 수 입력 : ");
			int n2 = sc.nextInt();
			if(n1<n2) {
				System.out.print(n1+"와 "+n2+"중 큰수는 "+n2+"입니다.");
			}else{
				System.out.print(n1+"와 "+n2+"중 큰수는 "+n1+"입니다.");
					}
			
	}
}