package sub2;

/*
 * 날짜 : 2022/08/25
 * 이름 : 김철학
 * 내용 : Java 캡슐화 실습하기
 * 
 * 캡슐화(Encapsulation)
 *  - 캡슐화는 객체의 속성을 외부에 참조하지 못하도록 객체의 정보를 은닉하는 특성
 *  - 클래스의 속성은 반드시 private 선언을 통해 캡슐화 
 *  - 은닉된 정보의 안전한 외부 참조를 위해 Getter, Setter를 제공
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car("소나타", "흰색", 10);
		sonata.setColor("은색");
		sonata.speedUp(80);
		sonata.speedDown(40);
		sonata.show();
		
		// Account 객체 생성
		Account kb = new Account("국민은행", "101-12-1001", "김유신", 1000);
		kb.deposit(47000);
		kb.withdraw(35000);
		kb.show();
		
		Account wr = new Account("우리은행", "101-12-2012", "김춘추", 10000);
		wr.deposit(75400);
		wr.withdraw(54100);
		wr.show();
		
	}
}
