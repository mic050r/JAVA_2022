import java.util.Scanner;
public class Whilescore{
     public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
       int score, count = 0, total = 0; //count ���� � ���������� ���� 
       System.out.print("������ �Է��ϼ��� : ");
       score = sc.nextInt();

       while(score != 0) {
           total += score;
           count++;    //���� ���� ī��Ʈ
           System.out.print("������ �Է��ϼ��� : ");   //0�� �Էµ� ������
           score = sc.nextInt();
        }
        if(count == 0) {//������ 0 ���� �߻�
           System.out.println("�Է¾���");
        }else{
        //��� ���ϱ�
           System.out.println("================");
           System.out.println("���� : " + total);
           System.out.printf("��� : %.2f ", (double)(total/count));
        }
   }
}