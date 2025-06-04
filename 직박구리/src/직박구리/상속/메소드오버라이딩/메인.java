package 직박구리.상속.메소드오버라이딩;

public class 메인 {

	public static void main(String[] args) {
		어머니 mama = new 어머니();
		아들 son = new 아들();
		딸 daughter = new 딸();
		
		mama.name(); //어머니 출력
		son.name(); //아들 출력
		daughter.name(); //딸 출력

	}

}

//오버라이딩을 통해 name 메소드의 기능을 클래스마다 다르게 구현 => 다형성 실현
