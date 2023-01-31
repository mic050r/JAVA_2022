package test1;
/*좌표 상의 점을 모델링하여 점을 생성하고 이동하는 프로그램을 작성해보자.
1. x,y 좌표를 입력받아 점을 생성한다. 
2. 생성자메서드를 통해 점을 생성한다.
3. 점의 현재 위치를 출력한다. =>매개변수 x this.x를 출력하는 거
4. 점을 입력받은 값만큼 이동하다 =>매개변수 o 이동할 값을 넣어줘야하니깐.*/

class MakePoint{
	//멤버 변수 2개 x,y
	private int x;
	private int y;

	public MakePoint() {};

	//생성자 메서드 2개
	public MakePoint(int x, int y) { //mp24줄
		this.x = x;
		this.y = y;
	}

	//메서드 = 2개(3. 출력, 4.이동)
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void getMove(int x, int y) { //mp33줄
		this.x += x;
		this.y += y;
	}

}

