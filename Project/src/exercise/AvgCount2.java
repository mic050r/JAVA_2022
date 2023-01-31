package exercise;

import java.util.Scanner;

public class AvgCount2 {

	public static void main(String[] args) {
		int score[] = new int[4]; // 배열은 변수들이 모인 것이므로 배열을 이루고 있는 배열요소는 하나의 변수로 생각
		float sum = 0; //sum은 for문 밖에서도 출력할거니까 초기값을 여기에 지정해주어야 함
		Scanner sc = new Scanner(System.in); //Ctrl + shift + o 누르면 자동으로 import 설정
		System.out.println("4과목의 성적을 입력하시오 (한 과목씩 입력) : ");
		for(int i = 0; i < score.length; i++) {

			score[i] = sc.nextInt(); //for문에 의해 4번 돌면서, score 배열에 4개의 값을 입력받음
			sum += score[i];
		}
		System.out.println("합계 성적 : " + sum);
		System.out.println("평균 성적 : " + (sum/score.length));
	}

}
