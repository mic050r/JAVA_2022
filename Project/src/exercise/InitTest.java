package exercise;
//초기화 연습 (for)
public class InitTest {

	public static void main(String[] args) {
		int[] a = new int[100];
		for(int i = 0; i < a.length; i++) {
			a[i] = i+1;
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
