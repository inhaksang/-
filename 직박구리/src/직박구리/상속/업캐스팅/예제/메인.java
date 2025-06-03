package 직박구리.상속.업캐스팅.예제;

public class 메인 {

	public static void main(String[] args) {
		Parent p = new Child(); 
		//업캐스팅임. 슈퍼클래스 Parent 타입이지만 내용은 Child인 객체 p 생성
		//이러면 Child중에 Parent에서 상속받은 놈들만 사용가능. Child에만 있는 display는 사용불가
		
		p.show(); 
		//얘는 가능, 참고로 p는 Child의 객체를 생성한거라 Parent의 show()가 아니라 Child의 show()가 실행됨
		
		Child c = (Child)p; 
		//강제형변환과 같은 방법으로 p의 타입을 변경하여 Child타입의 c에 저장
		//->p를 다시 Child로, 원래대로 돌려놓는것이 다운캐스팅
	}

}
