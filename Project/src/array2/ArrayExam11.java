package array2;

public class ArrayExam11 {

	public static void main(String[] args) {
		System.out.println("---------자바 실행---------");
		int[][] a = new int[4][4];
		for(int i = 0; i < a.length; i++) {
			for(int j =0; j< a[i].length; j++) {
				a[i][j] = 1;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("출력 완료 (0초 결과) - 정ㅅ상 종료");
	}

}
