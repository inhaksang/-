package 직박구리.상속;

public class Point {
	
	private int x, y;
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

}
