//������ �Է¹޾� ������ ���ϴ� ���α׷� �ۼ�
import java.util.Scanner;
public class Absolute{
    public static void main(String args[]){	
       Scanner scan = new Scanner(System.in); //�Է��� �޴� ���
       System.out.print("���� �Է� : ");
       int num = scan.nextInt();

       getAbsolute(num);
    } //end of main
    
    public static void getAbsolute(int num) {
       if(num >= 0) { //���밪�� ���ϴ� ���
           System.out.println(num +"�� ������ " +num +"�Դϴ�.");
       }
       else{
           System.out.println(num +"�� ������ " +num*(-1) +"�Դϴ�.");
       }

    }
}