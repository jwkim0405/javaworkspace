package test04_super;



public class Student extends Person {
	String major;
	
	// 아무런 생성자도 정의하지 않은 상태
	// => 컴파일러가 기본생성자 Student(){}를 만들어 줌
	// => 생성자는 내부에 기본적으로 super();가 생략되어 있음.
	// => 기본적으로 부모 클래스의 기본생성자를 호출한다는 뜻.
	
//	// 빈 공간에서  ctrl + spacebar
//	public Student() {
//		// super();	// 생성자 내부에는 기본적으로 super();가 생략되어있다.
//		// 내부적으로 Person()을 호출하고 있다.

//		
//		// 1. 프로그래머가 명시적으로 super()를 호출하지 않아도 
//		// => 기본적으로 super();를 호출
//
//		// 2. 프로그래머가 명시적으로 super()_를 호출하면??
//		// => super()를 넣어주지 않는다.
//	}
	
	// 마우스 우클릭 > Source > Generate Constructor ..
	public Student() {
		super();	// 자동으로 생략되어 있는 super()를 생성해줌.
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	void eat() {
		System.out.println("음식을 먹습니다.");
	}


	void study() {
		super.eat();
		System.out.println("공부를 합니다.");
	}
}
