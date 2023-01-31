package test1;

public class Car {
	//정적인 속성
	String name;
	int speed = 0;
	
	//동적인 특성(메서드)
	public void speedUp() {
		speed += 10;
	}
	public void speedDown() {
		if(speed >= 10) {
			speed -= 10;
		}
	}
	public void stop() {
		speed = 0;
	}//3단계
}
