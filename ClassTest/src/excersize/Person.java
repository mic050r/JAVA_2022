package excersize;
/*명세서, 작업 지시서
 * 사람의 성명을 모델하는 Person 클래스를 설계하고 작성하라
 * 그 클래스는 사람의 성과 이름을 나타내고 다음 메솓드를 가진다.
 * 
 * 1. 사람의 성과 이름을 받아 초기화하는 생성자
 * 2. 성을 반환하는 메서드 (getLastName)
 * 3. 이름과 반환하는 메서도 (getFirstName)
 * 4. 성과 이틀만에 포함된 문자들의 총수룰 반환하는 메소드 (getLength)
 */
public class Person {
	private String lastName;
	private String firstName;
	private int len;
	public Person(String lastName, String FirstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	public String getLastName(String lastName, String FirstName) {
		return this.lastName = lastName;
	}
	public String getFirstName(String lastName, String FirstName) {
		return this.lastName = lastName;
	}
	public int getLength(String lastName, String FirstName, int len) {
		return len = lastName.length() + FirstName.length();
	}
}
