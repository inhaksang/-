package 직박구리.상속.업캐스팅;

public class Student extends Person{
	
	String grade;
	
	public Student(String name) { //메인에서 인자를 받음 -> name = "경표경표"
		super(name);
	//슈퍼클래스 Person의 String인자를 받는 생성자에 인자 "경표경표"를 전달
	}
	

}
