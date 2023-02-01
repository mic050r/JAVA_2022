
import java.util.Scanner;
public class ScorePrecessing {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String name = "";
		int eng=0, kor = 0, java = 0;
		input(name, eng, kor, java);
		
		double sum = 0.0;
		getSum(eng, kor, java);
		
		double avg = 0.0;
		
		int rank = 0;
		
		output(name, kor, eng, java, sum, avg, rank);
	}


	private static void output(String name, int kor, int eng, int java, double sum, double avg, int rank) {
		System.out.println("========================성적 처리 결과========================");
		System.out.println("학번    이름    국어    영어    자바    합계    평균    ");
		System.out.println(name +"\t" + kor + "\t" + eng +"\t" + java +"\t" +sum +"\t" + avg+"\t" + rank);
	}


	public static void input(String name, int eng, int kor, int java) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학번 이름 입력 : ");
		name = sc.nextLine();
		System.out.println("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.println("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.println("자바 점수 입력 : ");
		java = sc.nextInt();
	}

	private static int getSum( int eng, int kor, int java) {
		int result = eng + kor + java;
		System.out.println("합계 : " + result);
		return result;
	}
}
