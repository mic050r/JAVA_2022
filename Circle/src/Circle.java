package src;
//���� ����(getArea)�� �ѷ�(getCircum)�� ���ϴ� ���α׷��� �ۼ��϶�.
//������ => final double PI = 3.14;
import java.util.Scanner;	
public class Circle {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("������ �Է� : ");
			int r = scan.nextInt();
			final double PI = 3.14;
			getArea(r, PI);	
			getCircum(r, PI);
			System.out.println("���� �ѷ� : " + getCircum(r, PI));
			System.out.println("���� ���� : " + getArea(r, PI));
	}
	public static double getCircum(int r, double PI) {
		double result = 2*r*PI;
		return result;
	}
	public static double getArea(int r, double PI) {
		double result = r*r*PI;
		return result;
	}

}