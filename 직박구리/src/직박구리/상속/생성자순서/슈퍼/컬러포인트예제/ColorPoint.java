package 직박구리.상속.생성자순서.슈퍼.컬러포인트예제;

public class ColorPoint extends Point{
	
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y); //슈퍼클래스인 Point클래스의 x, y값을 받는 생성자가 실행됨 -> Point 클래스의 x와 y값을 저장
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
	

}
