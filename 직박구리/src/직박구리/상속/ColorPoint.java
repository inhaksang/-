package 직박구리.상속;

public class ColorPoint extends Point{
	
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint(); //상속받아서 그냥 씀
	}

}
