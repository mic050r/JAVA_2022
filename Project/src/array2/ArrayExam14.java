package array2;
import java.util.Scanner;
public class ArrayExam14 { //수행 비슷한 난이도 //Array2_score.java                                                                          

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*String names[] = {"완성도", "창의성", "이해도"};
	for(int i = 0; i < names.length; i++) {
		System.out.print("\t" +names[i] + "\t");
	}
	System.out.println(" ");*/

	int score[][] = new int[5][3];
	for(int i = 0; i < score.length; i++) {
		for (int j =0; j < score[i].length; j++) {
			System.out.print((i+1) + "조의 점수 : ");
			score[i][j] = sc.nextInt();
		}

	}

	}

}
