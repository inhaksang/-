package 직박구리.상속.생성자순서.슈퍼;

public class B extends A{
	
	public B() {
		System.out.println("B생성자");
	}
	
	//기본적으로 슈퍼클래스의 기본생성자 (public A())가 실행됨
	
	public B(int x) {
		super(x); //super(인자)를 사용하여 슈퍼클래스의 특정 생성자 지정 가능
		System.out.println("인자받은B생성자");
	}
	//무조건 super는 첫 줄에 와야 함

}
