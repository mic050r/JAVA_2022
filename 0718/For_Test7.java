import java.util.Scanner;
public class For_Test6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� ==> ");
		char alp = scan.next().charAt(0);	// ���ĺ� �Է�
		int i = 1, count;	 // i : ���ĺ��� ����� ���� , count : ���ĺ��� ����� ����	
		for (char start = 65; start<=alp; start++){		// A(65)���� �Է��� ���ڱ��� �ݺ�
        												// �ٹٲ޵� ������ A�� B�� �ǰ� B�� C�� �ȴ�.
        												// start : ���� ���ĺ� , alp : �� ���ĺ�
			for (count = 1; count <= i; count++) {
				System.out.print(start);	// ���ĺ� ���
			}
			i+=2;
            // �� �ݺ����� ���� ������ ��µǴ� ���ĺ��� ������ 2�� ����
			System.out.print("\n");
		}
	}
}