package overLoading;
/*두 수 = > a +b
 * 세 수 => a + b - c;
 * 네 수 => a + b - c *d
 */
class Calulator{
	private int a,b,c,d;
	int result;
	public void Calculaotor(int a, int b) {
		result = a + b;
	}
	public void Calculaotor(int a, int b, int c) {
		result = a + b - c;
	}
	public void Calculaotor(int a, int b, int c, int d) {
		result = a + b;
	}
}
public class OverLoadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calulator c1 = new Calulator();
		c1.Calculaotor(5, 4);
		System.out.println(c1.result);
	}

}
