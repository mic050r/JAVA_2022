import java.util.Scanner;
public class Discount{
    public static void main(String args[]){	
       Scanner scan = new Scanner(System.in); //�Է��� �޴� ���
       System.out.print("��ǰ�� ���� �Է� : ");
       int count = scan.nextInt();

       System.out.println("�� ���� : " + getPrice(count) + "��");

    } //end of main
    public static Double getPrice(int count) {
       double result = 0;
       int pro = 100000;  //�ϳ��� 100,000���� ��ǰ
       if(count >= 10) {
           result = (pro*count*0.9);  //10% ����
       }
       else{
       result = pro*count;
       }
       return result;
    }
}