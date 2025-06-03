package 직박구리.상속.업캐스팅.인스턴스오브;

public class 메인 {
	
	public static void main(String[] args) {
		A a = new D(); //A타입의 D 객체 a 생성
		
		//(객체명 instanceof 클래스타입) 형태로 객체의 타입 판별 가능 (true/false 반환)
		
		if(a instanceof A) 
			System.out.println("A타입이면서");
		//참. 애초에 A타입으로 선언했기때문에 컴파일 시점부터 A타입은 참임.
		
		if(a instanceof B)
			System.out.println("B타입이면서");
		//참. 런타임시점에서 a는 D를 가리키기 때문에 D의 부모인 B타입도 참임. 
		
		if(a instanceof C)
			System.out.println("C타입이면서");
		//거짓. C는 D의 부모가 아님. C는 A의 자식이자 D의 삼촌임. D는 C로부터 아무것도 물려받지 않음
		
		if(a instanceof D)
			System.out.println("D타입");
		//참. D 객체를 생성했으니 당연히 참
	}

}
