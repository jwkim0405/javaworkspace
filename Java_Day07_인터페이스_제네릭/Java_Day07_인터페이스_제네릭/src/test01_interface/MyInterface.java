package test01_interface;

public interface MyInterface {
	// 인터페이스에서는 변수 선언 앞에
	// public static final이 생략되어 있는 것임
	// => 인터페이스의 모든 변수는 사실은 상수(static)
	/*public static final*/ int MEMBER_1 = 10;
	public static final int MEMBER_2 = 20;
	
	// 모든 메서드가 추상메서드
	// 모든 메서드 선언 앞에 사실은 public abstract가 생략되어 있는 것임
	void method1();
	public abstract void method2();
	
	default void method3() {
		System.out.println("default method!");
	}
	
	static void method4() {
		System.out.println("interface static method!");
	}
	
	// 1. default 메서드끼리 겹친다면?
	// A implements B, C {}
	// - B, C 동일한 이름의 default 메서드 있다면
	// => 구현 클래스 (A)에서 오버라이드를 해줘야 함!
	// 	오버라이드: B를 선택. C를 선택, 전혀 다른 메서드로 정의
	
	// 2. default 메서드와 상위클래스의 메서드가 겹치는 경우
	// A extends B implements C
	// B의 메서드와 C의 default 메서드가 겹칠 때
	// => 기본적으로 B의 메서드를 사용
	// => 재정의할 수도 있다.
	
}
