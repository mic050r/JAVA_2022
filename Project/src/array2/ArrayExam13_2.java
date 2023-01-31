package array2;

public class ArrayExam13_2 { //중간고사에 나옴-> 이런 코드도 가능하다 
										//1은 메모리 할당이 다 되어있음, 이건 메모리 할당이 안되어 있음

	public static void main(String[] args) {
		int a[][] = new int[4][]; //행은 4개짜리인데 열은 몰라
		for(int i =0; i < a.length; i ++) {
			a[i] = new int[i+1];
		}
		int sum = 1;
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sum++;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println(" ");
	}
	}
}
