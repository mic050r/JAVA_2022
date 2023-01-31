package exercise;

public class AvgCount {

	public static void main(String[] args) {
		String names[] = {"홍길동", "이순신", "강감찬", "김태희", "전지현"};
		int[][] score = {{80, 70, 80 },  {90,90, 90}, {50, 60, 77}, {100, 100, 100}, {80, 60, 60}  };
		System.out.println("   <학생 점수표>    ");
		System.out.printf("          국어 영어 수학\n");
		for(int i = 0; i < names.length; i++) {  //names 행크기만큼 반복
			System.out.print(names[i] + " "); //names 열 출력
				for(int j = 0; j < score[i].length; j++) {  //score 열크기 만큼 반복
					System.out.printf("%3d", score[i][j] );  //score 행, 열 출력
				}
				System.out.println();
		}
		System.out.println("---------------");
		//5명의 총점을 저장할 배열 생성
		int studentTotal[] = new int[5];
		System.out.println("<학생별 총점>");
		for(int i = 0; i < score.length; i++) {
			/*학생 점수 인덱스 중 행번호에 해당하는 인덱스가
			 학생 총점의 인덱스로 사용될 수 있다!
			 => 즉, 각 학생의 행번호(i)를 사용하여 학생의 3과목 점수를
			 총점 배열의 인덱스에 행번호를 사용하여 누적*/
				for(int j = 0; j< score[i].length; j++) 
					studentTotal[i] += score[i][j];
				//1명의 점수 누적이 끝난 시점에서 이름과 총점을 출력
				System.out.print(names[i] + " : " + studentTotal[i] + "점");
				System.out.println();
		}
	}

}
