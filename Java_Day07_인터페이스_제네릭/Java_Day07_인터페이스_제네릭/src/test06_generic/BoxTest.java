package test06_generic;

// 제네릭 클래스
// <>안에 타입 파라미터를 정해준다.

class Box <T> {
	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		// 제네릭 클래스의 사용: 사용 시점에 타입 매개변수에 타입을 정해준다.
		Box<Integer> intBox = new Box<Integer>();
		Box<String> StringBox = new Box<>();	// 생성자 호출 부분에서 타입을 생략할 수도 있다.
		Box<Double> doubleBox = new Box<>();
		
		intBox.setT(11);
//		stringBox.setT("Hello");
//		String value = StringBox.getT();	// 형 변환에 필요가 없다. instanceof
		
		// 제네릭에서 타입을 쓸 때, => 클래스로 써줘야 함
		// 기본형: int, double, char, boolean => Wrapper 클래스를 사용해야 함.
		
		int i1 = 11;	// 객체가 아님
//		i1. 
		
		Integer i2 = 11; // autoboxing (굳이 말하지 않아도 기본형 값을 감싸서 자동으로 객체를 만들어준다.)
		// i2. 객체
		
		Integer i3 = Integer.valueOf(123); // 메서드를 이용한 Boxing
		
		int i4 = i2;	//auto unboxing 자동으로 객체가 기본형 변수로 바뀜
		int i5 = i3.intValue();		// 메서도를 활용한 unboxing
		
	}
}
