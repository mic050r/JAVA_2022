package test1;

public class ArrayTest2 {  //�߰� �� ���õ� �� ���

	public static void main(String[] args) {
		int [] a = new int[10]; //0
		for (int i = 0; i<a.length; i++) {//�ε��� i -> i�� must ������ int , double �ȵ�
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
