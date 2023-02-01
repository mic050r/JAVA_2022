import java.util.Scanner;
public class For_Test6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 입력 ==> ");
		char alp = scan.next().charAt(0);	// 알파벳 입력
		int i = 1, count;	 // i : 알파벳을 출력할 갯수 , count : 알파벳을 출력한 갯수	
		for (char start = 65; start<=alp; start++){		// A(65)부터 입력한 문자까지 반복
        												// 줄바꿈될 때마다 A가 B가 되고 B가 C가 된다.
        												// start : 시작 알파벳 , alp : 끝 알파벳
			for (count = 1; count <= i; count++) {
				System.out.print(start);	// 알파벳 출력
			}
			i+=2;
            // 이 반복문이 끝날 때마다 출력되는 알파벳의 갯수가 2씩 증가
			System.out.print("\n");
		}
	}
}