package test1;
class A{ //부모클래스
	int number;
	String name;
}
class AA extends A { //자식 AA는 A를 상속받는다.
	int tel_number;
}
public class inputheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA test1 = new AA();
		test1.name = "나는 자식 클래스";
	}

}
