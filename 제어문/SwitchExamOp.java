import java.util.Scanner;
public class SwitchExamOp{
    public static void main(String args[]){
  	 System.out.print("수식 입력(수와 연산자 사이는 공백을 둘 것) : ");
  	 Scanner scan=new Scanner(System.in);
  	    int a=scan.nextInt();
  	    String op=scan.next();
   	    int b=scan.nextInt();
 	    switch(op){
      		 case "+":  System.out.println(a+" + "+b+" = "+(a+b));break;
      		 case "-":  System.out.println(a+" - "+b+" = "+(a-b));break;
       		 case "*":  System.out.println(a+" * "+b+" = "+(a*b));break;
       		 case "/":  System.out.println(a+" / "+b+" = "+(a/b));break;
       		 default: System.out.println("사칙 연산자가 아닙니다.");
   }
   
   }
}