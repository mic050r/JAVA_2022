import java.util.Scanner;
public class Gcd_pra1{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    int n2 = scan.nextInt();
    while(n1!=n2){
        if(n2>n1){
            n2-=n1;
        }else if(n1>n2){
            n1-=n2;
        }
    }
    System.out.print(n1); //왜 n1이 최대공약수인가
    }
}
