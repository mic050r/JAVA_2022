package exercise;

public class Alpha {

	public static void main(String[] args) {

		char ch[] = new char[26];
		for(int i = 0; i < ch.length; i++) {
			ch[i] = (char)(65 +i);
			System.out.print(ch[i] + " ");
		}
	}

}
