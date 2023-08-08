import java.util.Scanner;
public class Relation_test3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result=(age>=19) ? "성인" : "청소년";
		System.out.print("당신은 " + result + " 입니다.");
		
		/*System.out.print("나이 입력 : ");
		int age = scan.nextInt(); 
		int  b = 19;
		String y="청소년";
		String a="성인";
		String c = (age<b) ? y:a;
		System.out.println(c);
		int age;
		String result;
		System.out.print("나이 입력 :");
		age=scan.nextInt();
		result=(age>=19)?"성인":"청소년";
		System.out.println("당신은" +result+"입니다."); 
		*/
	}
}