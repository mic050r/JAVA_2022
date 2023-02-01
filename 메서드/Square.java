//사각형의 가로, 세로 길이를 입력 받아 넓이를 구하는 프로그램 작성
import java.util.Scanner;
public class Square{
    public static void main(String args[]){	
       Scanner scan = new Scanner(System.in); //입력을 받는 기능
       System.out.print("가로 입력 : ");
       int width = scan.nextInt();

       System.out.print("세로 입력 : ");
       int height = scan.nextInt();
       getArea(width, height);

       System.out.println("사각형의 면적 : " + getArea(width, height));

    } //end of main
    public static int getArea(int width, int height){
         int result;
         result = width*height;
         return result;
    }
}