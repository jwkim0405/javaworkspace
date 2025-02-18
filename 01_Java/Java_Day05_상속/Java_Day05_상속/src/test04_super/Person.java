package test04_super;

//extends 키워드를 명시하지 않으면
//사실은 Object 클래스를 상속받고 있는 것임.
public class Person {
	String name;
	int age;

	// 부모 클래스에서 매개변수가 있는 생성자를 만들었더니
	// 경고 발생!!!
	public Person() { 
		// object 클래스의 생성자를 호출하고 있다.
	}
	
	public Person(String name, int age) {
		// 말하지 않아도 super();가 생략되어 있다.
		this.name = name;
		this.age = age;
	}

	void eat() {
		System.out.println("음식을 먹습니다.");
	}
}