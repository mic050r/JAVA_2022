//������ �Է¹޾� ������ ���ϴ� ���α׷� �ۼ�
import java.util.Scanner;
public class Absolute1{
    public static void main(String args[]){	
       Scanner scan = new Scanner(System.in); //�Է��� �޴� ���
       System.out.print("���� �Է� : ");
       int num = scan.nextInt();

       System.out.println("���� :  " + getAbsolute(num));
    } //end of main
    
    public static void getAbsolute(int num) {
       if(num >= 0) { //���밪�� ���ϴ� ���
           return num;
       }
       else{
           return num*(-1);
       }

    }
}