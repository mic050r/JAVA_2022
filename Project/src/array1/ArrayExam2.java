package array1;

public class ArrayExam2 {

	public static void main(String[] args) {
		int [] a = new int[] {1,2,3,4,5,6,7,8,9,10}; //값을 초기화해서 초기화 한 값을 출력한다.
		for (int i = 0; i<a.length; i++) { //반복문 a 배열을 인덱스 0부터 length-1까지 순회하면서 각 원소를 출력한다.
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
