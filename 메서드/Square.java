//�簢���� ����, ���� ���̸� �Է� �޾� ���̸� ���ϴ� ���α׷� �ۼ�
import java.util.Scanner;
public class Square{
    public static void main(String args[]){	
       Scanner scan = new Scanner(System.in); //�Է��� �޴� ���
       System.out.print("���� �Է� : ");
       int width = scan.nextInt();

       System.out.print("���� �Է� : ");
       int height = scan.nextInt();
       getArea(width, height);

       System.out.println("�簢���� ���� : " + getArea(width, height));

    } //end of main
    public static int getArea(int width, int height){
         int result;
         result = width*height;
         return result;
    }
}