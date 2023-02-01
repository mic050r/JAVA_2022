import java.util.Scanner;
public class Discount{
    public static void main(String args[]){	
       Scanner scan = new Scanner(System.in); //입력을 받는 기능
       System.out.print("제품의 수량 입력 : ");
       int count = scan.nextInt();

       System.out.println("총 가격 : " + getPrice(count) + "원");

    } //end of main
    public static Double getPrice(int count) {
       double result = 0;
       int pro = 100000;  //하나에 100,000원인 제품
       if(count >= 10) {
           result = (pro*count*0.9);  //10% 할인
       }
       else{
       result = pro*count;
       }
       return result;
    }
}