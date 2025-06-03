package 직박구리.상속.생성자순서.슈퍼;

public class A {
	
	public A() {
		System.out.println("A생성자");
	}
	
	public A(int x) { //서브클래스에서 super()를 써야 실행되는 생성자.
		System.out.println("인자받은A생성자");
	}

}
