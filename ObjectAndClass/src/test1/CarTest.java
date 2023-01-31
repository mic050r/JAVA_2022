package test1;

public class CarTest {

	public static void main(String[] args) {//실제 실행은 main에서
		//인스턴스 객체 생성
		Car c1 = new Car(); //지금 몰라도 됨
		c1.name = "아반떼";
		c1.speedUp();	c1.speedUp();	c1.speedUp(); //30
		System.out.println(c1.name + "의 속도 : " + c1.speed);
		c1.stop();
		System.out.println(c1.name + "의 속도 : " + c1.speed);
		
		Car c2 = new Car();
		c2.name = "그랜져";
		c2.speedUp();	c2.speedUp();	c2.speedDown();
		System.out.println(c2.name + "의 속도 : " + c2.speed);
	}

}
