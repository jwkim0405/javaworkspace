package test03_inheritance;

public class Student extends Person {
	String major;
	
	void eat() {
		System.out.println("음식을 먹습니다.");
	}
	
	void study() {
		System.out.println("공부를 합니다.");
	}
}
