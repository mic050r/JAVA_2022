package array2;

public class ArrayExam13 {

	public static void main(String[] args) {
		int a[][] = new int[4][4];
		int sum = 1;
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				a[i][j] = sum++;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

}
