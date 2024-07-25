package class08;

public class Dog {
	String name;
	int age;
	
	Dog() {
		}
	
	// 생성자에도 매개변수가 올 수 있다.
	// 생성자: 멤버필드를 초기화하는 데 사용
	Dog(String name, int age) {
		// this. 를 통해 구별한다.
		// this. : 내(생성된 인스턴스)가 가지고 있는
		// this : 객체(실제로 메모리에 생성된 인스턴스) 나자신을 가리키는 참조값
		this.name = name;
		this.age = age;
	}
	
	Dog(String name) {
//		this.name = name;
//		this.age = 5;
		
		this(name, 5);	// 내가 이미 가지고 있는 생성자를 호출
		// 중요한 제약사항: 반드시 생성자 본문에서 첫줄에 위치??????
	}
	Dog(int age) {
		this("무명", age);
	}
	
	Dog eat() {
		System.out.println("사료를 먹고...");
		return this;
	}
	
	void drink() {
		System.out.println("물을 마십니다 : )");
	}
	
	void Dog(char a) {
		System.out.println("물을 계속 마십니다 : )");
	}
}
