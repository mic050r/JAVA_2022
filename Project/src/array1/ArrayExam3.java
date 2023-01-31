package array1;
public class ArrayExam3 {

	public static void main(String[] args) {
		int[] a = new int[3]; //배열객체의 각 원소는 0으로 초기화 된다.
		a[0] = a[0] + 1;
		a[1] = a[1] + 2;
		a[2] = a[2] + 3;
		for( int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
