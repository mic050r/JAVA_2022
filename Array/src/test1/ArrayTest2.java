package test1;

public class ArrayTest2 {  //중간 때 나올듯 쌤 언급

	public static void main(String[] args) {
		int [] a = new int[10]; //0
		for (int i = 0; i<a.length; i++) {//인덱스 i -> i는 must 무조건 int , double 안됨
			System.out.println(a[i]);
		}
		
		double [] b = new double[5];  //0.0
		for (int i =0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		char[ ] c = new char[3];  //space
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		boolean [] d = new boolean[2]; //double
		for(int i = 0; i <d.length; i++) {
			System.out.println(d[i]);
		}
	}

}
