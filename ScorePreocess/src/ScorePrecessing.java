
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
		System.out.println("========================���� ó�� ���========================");
		System.out.println("�й�    �̸�    ����    ����    �ڹ�    �հ�    ���    ");
		System.out.println(name +"\t" + kor + "\t" + eng +"\t" + java +"\t" +sum +"\t" + avg+"\t" + rank);
	}


	public static void input(String name, int eng, int kor, int java) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�й� �̸� �Է� : ");
		name = sc.nextLine();
		System.out.println("���� ���� �Է� : ");
		eng = sc.nextInt();
		System.out.println("���� ���� �Է� : ");
		kor = sc.nextInt();
		System.out.println("�ڹ� ���� �Է� : ");
		java = sc.nextInt();
	}

	private static int getSum( int eng, int kor, int java) {
		int result = eng + kor + java;
		System.out.println("�հ� : " + result);
		return result;
	}
}
