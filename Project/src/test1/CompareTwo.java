package test1;

//두 수를 입력 받아 크기를 비교하는 프로그램
import java.util.Scanner;
public class CompareTwo{
  public static void main(String args[]){	
     Scanner scan = new Scanner(System.in); //입력을 받는 기능
     System.out.print("정수 입력 : ");
     int n1 = scan.nextInt();

     System.out.print("정수 입력 : ");
     int n2 = scan.nextInt();

     System.out.println("두 수 중 " + getcompareOfTwo(n1, n2)+ "가 더 큽니다.");

  } //end of main
  public static int getcompareOfTwo(int n1, int n2){
       int result;
       if(n1>n2){
           result = n1;
       }else{
           result = n2;
       }
       return result;
  }
}