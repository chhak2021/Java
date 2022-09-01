package sub1;

/*
 * 날짜 : 2022/09/01
 * 이름 : 김철학
 * 내용 : 추상클래스 실습하기
 * 
 * 추상클래스(Abstract Class)
 *  - 일반 클래스를 정의하기 위한 기본 틀을 제공하는 클래스
 *  - 추상클래스를 상속 받아 자식클래스에서 미완성 메서드(추상메서드)를 오버라이드 
 */
public class AbstractTest {
	
	public static void main(String[] args) {
	
		// 추상클래스 객체 생성할 수 없음
		//Car sonata = new Car("소나타", "흰색", 0);
		
		Car sonata = new Sedan("소나타", "흰색", 0);
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		Car bongo = new Truck("봉고", "파란색", 0);
		bongo.speedUp(80);
		bongo.speedDown(20);
		bongo.show();
		
	}
}
