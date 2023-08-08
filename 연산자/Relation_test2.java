import java.util.Scanner;
public class Relation_test2{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = scan.nextInt(); 
		if (age>=19) {
			System.out.println("성인");
		}else{ //age<19
			System.out.println("청소년");
		}
	}
}