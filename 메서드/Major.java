//�ڵ�(1,2,3)�� �Է¹޾� �а��� ����ϴ� ���α׷��� �ۼ��϶�
//�� ��, �а��� �����ϴ� �޼��� getMajor()�� �����Ͽ� �ϼ��϶�. 
import java.util.Scanner;
public class Major{
    public static void main(String args[]){	
       Scanner scan = new Scanner(System.in); //�Է��� �޴� ���
       System.out.print("�ڵ�(1, 2, 3)�� �Է� : ");
       int code = scan.nextInt();
       //getMajor(code);
       System.out.println("�а� : " +getMajor(code));

    } //end of main
    public static String getMajor(int code) {
       String result;
       switch(code) {
           case 1 :
               result = "���̵�����Ʈ�����"; 
               break;
           case 2 :
               result = "���̵�����ַ�ǰ�"; 
               break;
           case 3 :
               result = "���̵������ΰ�"; 
               break;
           default : 
               result = "�Է¿���";
       } 
       return result;
    }
}