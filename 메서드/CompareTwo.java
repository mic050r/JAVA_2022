//�� ���� �Է� �޾� ũ�⸦ ���ϴ� ���α׷�
import java.util.Scanner;
public class CompareTwo{
    public static void main(String args[]){	
       Scanner scan = new Scanner(System.in); //�Է��� �޴� ���
       System.out.print("���� �Է� : ");
       int n1 = scan.nextInt();

       System.out.print("���� �Է� : ");
       int n2 = scan.nextInt();

       System.out.println("�� �� �� " + getcompareOfTwo(n1, n2)+ "�� �� Ů�ϴ�.");

    } //end of main
    public static int getcompareOfTwo(int n1, int n2){
         int result;
         if(n1>n2){
             result = n1;
         }else{
             result = n2;
         }
         return result;
    }
}