package 직박구리.상속;

public class 메인 {

	public static void main(String[] args) {
		Point p = new Point();
		ColorPoint cp = new ColorPoint();
		
		p.set(1, 2);
		cp.set(2, 3);
		cp.setColor("yellow");
		p.showPoint();
		cp.showColorPoint();
	}

}
