import java.util.Scanner;
public class Whilescore_1{
     public static void main(String args[]){
       int score, count = 0, total = 0; 
       Scanner sc = new Scanner(System.in);

       while(true) {  //��ӹݺ�
           System.out.print("������ �Է��ϼ��� : ");   
           score = sc.nextInt();
           if(score ==0){
	     break; //while�� �������� *���尡��� �ݺ���*
          }else{
           total += score;
           count++;    //���� ���� ī��Ʈ
          }

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