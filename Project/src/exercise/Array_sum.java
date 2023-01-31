package exercise;

public class Array_sum {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		int[] a = new int[100];
		for(int i = 0; i < a.length; i++) {
			a[i] += i + 1;
			System.out.println(a[i]);
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i]%2 ==0) {
				num = -a[i];
			}else {
				num = a[i];
			}
			sum+=num;
		}
		System.out.println(sum);
	}

}
