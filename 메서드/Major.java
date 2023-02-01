//코드(1,2,3)를 입력받아 학과를 출력하는 프로그램을 작성하라
//이 때, 학과를 결정하는 메서드 getMajor()를 구형하여 완성하라. 
import java.util.Scanner;
public class Major{
    public static void main(String args[]){	
       Scanner scan = new Scanner(System.in); //입력을 받는 기능
       System.out.print("코드(1, 2, 3)를 입력 : ");
       int code = scan.nextInt();
       //getMajor(code);
       System.out.println("학과 : " +getMajor(code));

    } //end of main
    public static String getMajor(int code) {
       String result;
       switch(code) {
           case 1 :
               result = "뉴미디어소프트웨어과"; 
               break;
           case 2 :
               result = "뉴미디어웹솔루션과"; 
               break;
           case 3 :
               result = "뉴미디어디자인과"; 
               break;
           default : 
               result = "입력오류";
       } 
       return result;
    }
}