import java.util.Scanner;
public class Gcd{ //�ִ������� ��� �� ���� ū ���̴�.
     public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
       		int n1 = scan.nextInt();
        		int n2 = scan.nextInt();
		while(n1!=n2){ //�� ���� ���� ���� ���� �ݺ� => �� ���� ������ ������
			if(n1>n2){
				n1-=n2;
			}else if(n2>n1){
				n2-=n1;
			}
		}
		System.out.print("�ִ������� " +n1);
   }
}