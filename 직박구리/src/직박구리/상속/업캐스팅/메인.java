package 직박구리.상속.업캐스팅;

public class 메인 {

	public static void main(String[] args) {
		Person p; //슈퍼클래스 Person 타입의 객체 p 선언(생성이 아님)
		
		Student s = new Student("경표경표"); 
		//Student 객체를 생성할때 String타입 인자를 넣어줌으로써 생성자를 직접 지정함 (Student(String name))

		
		p = s; //이게 업캐스팅
		//업캐스팅: 서브클래스의 실체(레퍼런스)를 슈퍼클래스에 대입
		//p = s를 통해 서브클래스 s를 Person타입 p에 복사함
		
		System.out.println(p.name);
		//p의 타입은 Person이지만 내용은 Student("경표경표")임
		//name 필드는 Person(슈퍼)타입이기 오류없이 작동
		//만약 Student(서브)에만 있는 grade를 p.grade = 0;과 같이 건드리면 오류생김 (슈퍼클래스는 서브클래스를 참조할수 없기 때문)
		
		
		
	}

}
