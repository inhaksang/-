package 직박구리.상속.업캐스팅;

public class Person { //슈퍼클래스
	
	String name; 
	int age;
	
	public Person(String name) { //하위클래스에서 super(name)을 쓰면 실행
		this.name = name;
	}
	//메인에서 Student객체 생성할때 "경표경표"인자 전달 -> super()를 통해 Person까지 "경표경표" 전달

}
