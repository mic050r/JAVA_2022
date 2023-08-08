/* 두 정수의 합을 구하기
    두 정수 => 고정된 값이 아니라 변하는 값 */

public class AddTwo{
    public static void main(String args[]){
            int num1, num2;   //int => 정수형
            num1 = 5;
            num2 = 7;
            System.out.println("두 수의 합 : " + (num1+num2));
            num1 = 10;
            num2 = 1000; 
            System.out.println("두 수의 합 : " + (num1+num2));
    }
}