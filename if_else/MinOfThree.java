import java.util.Scanner;
public class MinOfThree{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		/*System.out.print("정수 3개 입력 : ");
		int n1 = sc.nextInt(); 
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.print("가장 작은 수는 ");
		if(n1>n2){
			if(n2>n3) {
				System.out.println("n3");
			}else{
				System.out.println(n2);
			}
		}else{
			if(n1<n3){
				System.out.println(n1);
			}else{
				System.out.println(n3);
			}
		}
	}
}*/
		System.out.print("첫 번째 수 입력 : ");
			int n1 = sc.nextInt();
		System.out.print("두 번째 수 입력 : ");
			int n2 = sc.nextInt();
		System.out.print("세 번째 수 입력 : ");
			int n3 = sc.nextInt();
				if(n1<n2) {
					if(n1<n3)
						System.out.println(n1+"와 "+n2+"와 "+n3 +" 중 제일 작은 수는 "+n1+"입니다.");
				}else if(n2<n1){
					if(n2<n3)
						System.out.println(n1+"와 "+n2+"와 "+n3 +" 중 제일 작은 수는 "+n2+"입니다.");
				}else if(n3<n1){
					if(n3<n2)
						System.out.println(n1+"와 "+n2+"와 "+n3 +" 중 제일 작은 수는 "+n2+"입니다.");
				}
	}
}
