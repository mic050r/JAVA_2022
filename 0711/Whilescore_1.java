import java.util.Scanner;
public class Whilescore_1{
     public static void main(String args[]){
       int score, count = 0, total = 0; 
       Scanner sc = new Scanner(System.in);

       while(true) {  //계속반복
           System.out.print("점수를 입력하세요 : ");   
           score = sc.nextInt();
           if(score ==0){
	     break; //while을 빠져나옴 *가장가까운 반복문*
          }else{
           total += score;
           count++;    //점수 갯수 카운트
          }

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