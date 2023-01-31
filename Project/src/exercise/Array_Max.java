package exercise;
import java.util.Scanner;
public class Array_Max {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		int score[] = new int[10];
		int max = 0; //유효하지 않은 점수 ex)-70 X ->예외 상황(Exception)
		//int max = score[o];
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "번째 학생의 점수 : ");
			score[i] = sc.nextInt();
			if(score[i] > max) {
				max = score[i];
			}
		}
		System.out.println("최고점수 : " + max);
	}

}
