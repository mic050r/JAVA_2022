package test1;
//√ ±‚»≠
public class ArrayTest3 {

	public static void main(String[] args) {
		//1.
		int [] score1 = new int [3];
		score1[0] = 100;
		score1[2] = 70;
		for (int i =0; i < score1.length; i++) {
			System.out.println("score1[" + i + "] = " + score1[i]);
		}
		//2.
		int[] score2 = new int[] {100, 56,78};
		for (int i =0; i < score2.length; i++) {
			System.out.println("score2[" + i + "] = " + score2[i]);
		}
		//3.
		int[] score3 = {45, 78, 99};
		for (int i =0; i < score3.length; i++) {
			System.out.println("score3[" + i + "] = " + score3[i]);
		}
	}

}
