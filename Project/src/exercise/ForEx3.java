package exercise;

public class ForEx3 {
 //1,3,5,7,9...51
	public static void main(String[] args) {
		int a[] = new int[26];
		for(int i = 0; i < a.length; i++) {
			a[i] += 2*i + 1;
		}
		for(int i = 0; i < a.length; i++) {
				System.out.print(a[i]  + "\t");
		}
		
		//2, 4, 6, 8, 10....40s
		int b[] = new int[20];
		for(int i = 0; i < b.length; i++) {
			b[i] = 2*i +2; //(i+1)*2
			System.out.print(b[i] + "\t");
		}
	}
}

