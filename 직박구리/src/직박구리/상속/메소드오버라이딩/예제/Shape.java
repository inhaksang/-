package 직박구리.상속.메소드오버라이딩.예제;

class Shape { //슈퍼 클래스
	public void draw() {
		System.out.println("Shape");
	}
}



class Line extends Shape { //서브1
	
	public void draw() { //오버라이딩
		System.out.println("Line");
	}
	
}



class Rect extends Shape { //서브2
	
	public void draw() { //오버라이딩
		System.out.println("Rect");
	}
	
}



class Circle extends Shape { //서브3
	
	public void draw() { //오버라이딩
		System.out.println("Circle");
	}
	
}
