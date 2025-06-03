package 직박구리.상속.업캐스팅.예제;

public class Child extends Parent{
	
	//서브클래스에서 새로 정의한 display 메서드
	public void display() {
		System.out.println("자식클래스의display메서드");
	}
	
	public void show() {
		System.out.println("자식클래스의 show메서드");
	}

}
