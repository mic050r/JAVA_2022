//"줄" 입력
import java.util.Scanner;
public class Star{
    public static void main(String args[]){	
       Scanner scan = new Scanner(System.in); //입력을 받는 기능
       System.out.print("줄 입력 : ");
       int number = scan.nextInt();

       getStar(number);

    } //end of main
    public static void getStar(int number){
      for(int i = 1; i <= number; i++){        
	      for(int j = 1; j <=i; j++){ 
	         System.out.print("*"); 
	      }                             
	   System.out.print("\n");
         }
    }
}