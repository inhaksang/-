package 직박구리.상속.메소드오버라이딩.예제;

public class MethodOverridingEx { //메인 실행 코드
	
	static void paint(Shape p) { //슈퍼클래스인 Shape 타입을 매개변수로 받기 때문에 Shape을 상속받은 자식들을 매개변수로 넘길수 있음
		
		p.draw(); //동적 바인딩
		
	}
	//객체를 생성하는 동시에 매개변수로 넘겨 자동으로 draw를 실행시키는 메소드
	

	public static void main(String[] args) {
		
		Line line = new Line(); //Line 의 객체 line 생성
		
		paint(line); //line 내의 draw 를 실행시키므로 "line"이 출력됨
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		//각각 객체에서 재정의된 draw를 실행

	}

}
