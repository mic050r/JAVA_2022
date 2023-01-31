package test1;

//정수를 입력받아 절댓값을 구하는 프로그램 작성
import java.util.Scanner;
public class Absolute{
  public static void main(String args[]){	
     Scanner scan = new Scanner(System.in); //입력을 받는 기능
     System.out.print("정수 입력 : ");
     int num = scan.nextInt();

     getAbsolute(num);
  } //end of main
  
  public static void getAbsolute(int num) {
     if(num >= 0) { //절대값을 구하는 기능
         System.out.println(num +"의 절댓값은 " +num +"입니다.");
     }
     else{
         System.out.println(num +"의 절댓값은 " +num*(-1) +"입니다.");
     }

  }
}