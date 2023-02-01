import java.util.Scanner;
public class Gcd{ //최대공약수는 약수 중 가장 큰 수이다.
     public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
       		int n1 = scan.nextInt();
        		int n2 = scan.nextInt();
		while(n1!=n2){ //두 수가 같지 않을 동안 반복 => 두 수가 같아질 때까지
			if(n1>n2){
				n1-=n2;
			}else if(n2>n1){
				n2-=n1;
			}
		}
		System.out.print("최대공약수는 " +n1);
   }
}