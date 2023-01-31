package test1;

import java.util.Scanner;

/*좌표 상의 점을 모델링하여 점을 생성하고 이동하는 프로그램을 작성해보자.
  1. x,y 좌표를 입력받아 점을 생성한다. 
  2. 생성자메서드를 통해 점을 생성한다.
  3. 점의 현재 위치를 출력한다. =>매개변수 x this.x를 출력하는 거
  4. 점을 입력받은 값만큼 이동하다 =>매개변수 o 이동할 값을 넣어줘야하니깐.*/
public class MakePointEx {

	public static void main(String[] args) {
		int x, y;

		Scanner sc = new Scanner(System.in);

		System.out.print("x 좌표 입력 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 입력 : ");
		y = sc.nextInt();

		//System.out.println("=>현재 점의 위치 : " + "(" + x + "," + y + ")");

		MakePoint p1 = new MakePoint(x, y);
		//System.out.println("=>생성자 메서드 점의 위치 : " + "(" + p1.getX() + "," + p1.getY() + ")");
		System.out.println("=>현재 점의 위치 : " + "(" + p1.getX() + "," + p1.getY() + ")");
		System.out.println(" ");
		
		System.out.print("이동할 x 좌표 입력 : ");
		x = sc.nextInt();
		System.out.print("이동할 y 좌표 입력 : ");
		y = sc.nextInt();

		p1.getMove(x, y);
		System.out.println("=> 이동한 점의 위치 : " + "(" + p1.getX() + "," + p1.getY() + ")");
	}

}
