import java.util.Scanner;
public class Whilescore{
     public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
       int score, count = 0, total = 0; //count 점수 몇개 들어오는지의 갯수 
       System.out.print("점수를 입력하세요 : ");
       score = sc.nextInt();

       while(score != 0) {
           total += score;
           count++;    //점수 갯수 카운트
           System.out.print("점수를 입력하세요 : ");   //0이 입력될 때까지
           score = sc.nextInt();
        }
        if(count == 0) {//나누기 0 예외 발생
           System.out.println("입력없음");
        }else{
        //평균 구하기
           System.out.println("================");
           System.out.println("총점 : " + total);
           System.out.printf("평균 : %.2f ", (double)(total/count));
        }
   }
}