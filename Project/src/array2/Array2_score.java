package array2;
import java.util.Scanner;
public class Array2_score {                                                                          
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String names[] = {"완성도", "창의성", "이해도"};
		
		int score[][] = new int[5][3];
		int team_score[] =new int[5];
		int max_score = 0, max_team = 0;
		
		for(int i = 0; i < score.length; i++) {  //5행
			System.out.println((i+1) + "조");
			for (int j =0; j < score[i].length; j++) {  //3열
				System.out.print(names[j] + " : ");
				score[i][j] = sc.nextInt();
				if(score[i][j] >= 0 && score[i][j] <= 20) {
					team_score[i] += score[i][j];
				}else {
					System.out.println("0 ~ 20 사이의 점수만 입력하시오");
					j--;
				}
			}
			//System.out.println((i+1) + "조의 점수의 합 : " + team_score[i]);
			
			if(team_score[i] > max_score) {
				max_score = team_score[i]; //행의 max_score값이 들어감
				max_team = i; //현재 인덱스 값이 들어감
			}
		}
		
		System.out.println("최고팀 : " + (max_team+1) + "번째 팀 -> 점수 : " + max_score);
	}
}
