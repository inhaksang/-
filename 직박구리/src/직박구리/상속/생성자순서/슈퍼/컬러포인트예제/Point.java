package 직박구리.상속.생성자순서.슈퍼.컬러포인트예제;

public class Point {
	
	private int x, y;
	public Point() { //기본 생성자
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

}
