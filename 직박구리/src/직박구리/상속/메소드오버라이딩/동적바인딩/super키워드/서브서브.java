package 직박구리.상속.메소드오버라이딩.동적바인딩.super키워드;

class 서브서브 extends 슈퍼슈퍼2{
	
	String name; //name을 재지정 (오버라이딩은 아님. 오버라이딩은 메소드에만)
	
	@Override
	void b() {
		name = "서브"; //별도의 지역변수 name
		super.name = "슈퍼"; //슈퍼클래스의 name
		super.b(); //슈퍼클래스의 name이 출력됨
		System.out.println(name); //서브클래스의 name이 출력됨
	}
	
	public static void main(String[] args) {
		슈퍼슈퍼2 f = new 서브서브();     //f 의 타입은 슈퍼슈퍼, 실체는 서브서브임
		
		f.a();     
		
		//super 키워드로 메소드를 호출할땐 정적바인딩임 => 컴파일 시점에 결정
	}

}