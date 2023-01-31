package overLoading;
//생성자 메소드에 오버로딩 : 동일한 메소드인데 매개변수에 따라서 메소드가 다른 뜻을 갖게 되는 것. 다형성
public class Student {
	private int number;
	private String name;
	private String major;
	private String tel_number;
	
	//오버로딩
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
		System.out.println("학변과 이름으로 학생 인스턴스 객체 생성");
	}
	public Student(int number, String name, String major) {
//		this.number = number;
//		this.name = name;
		this(number, name);
		this.major = major;
		System.out.println("학변과 이름, 전공 으로 학생 인스턴스 객체 생성");
	}
	public Student(int number, String name, String major, String tel_number) {
		this(number, name, major);
		this.tel_number = tel_number;
		System.out.println("학변과 이름, 전공, 전번 으로 학생 인스턴스 객체 생성");
	}
}
