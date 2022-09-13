package sub1;

/*
 * 날짜 : 2022/09/13
 * 이름 : 김철학
 * 내용 : 제네릭 실습하기
 * 
 * 제네릭(Generic)
 *  - 클래스 내부의 속성 타입을 동적으로 일반화 시키는 문법
 *  - 제네릭 사용으로 클래스를 범용성있게 사용
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 5000);
		Banana banana = new Banana("대만", 3000);
		
		// 제네릭 클래스 생성할 때 치환변수 T 타입 결정
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(apple);
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(banana);
		
		box1.getFruit().toString();
		box2.getFruit().toString();
	}
}
