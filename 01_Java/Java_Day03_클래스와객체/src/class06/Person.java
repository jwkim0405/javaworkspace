package class06;

public class Person {
	// 데이터
	// 멤버 변수
	String name;
	int age;
	String hobby;
	
	// 관련된 데이터와 로직을 하나로 묶어준다.
	// 멤버 메서드
	// 멤버 변수는 객체(인스턴스) 자기 자신이 가지고 있는 것이므로
	// 굳이 매개변수로 넘기지 않아도 접근 가능.
	// static: 클래스(설계도)
	//  static이 없으면 member 변수(?)이다.
	void info() {
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "입니다.");
		System.out.println("취미는 " + hobby +  "입니다.");
	}
	
	// 매개변수가 있는 메서드
	void study(int time) {
		// int time = (호출할 때 넘겨준 값);
		System.out.println(time + "시간 동안 공부합니다.");
	}
	
	// 메서드 오버로딩
	// - 이름이 같으면서 매개변수가 다른 메서드를 정의.
	// - 파라미터의 타입, 개수, 순서가 달라야 한다.
	void study(long time) {
		System.out.println(time + "시간 동안 공부합니다.");	
	}
	
	void study(double time) {
		System.out.println(time + "시간 동안 공부합니다.");
	}
	
	void study(String time) {
		System.out.println(time + "시간 동안 공부합니다.");
	}
	
	// 순서가 다른 것: 오버로딩 가능.
	void study(int time, String subject) {
		System.out.println(subject + "를 " + time + "시간 동안 공부합니다.");
	}
	
	void study(String subject, int time) {
		System.out.println(subject + "를 " + time + "시간 동안 공부합니다.");		
	}
	
	// 변수 이름만 다른 것: 안 됨
	// 빨간 줄이 뜨면 안 된다.
	
	
	
	
}
