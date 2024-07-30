package test01_interface;

public class Test {
	public static void main(String[] args) {
		// 인터페이스로 객체 생성: 불가능!! 
		// MyInterface mi = new MyInterface();
		
		MyClass m = new MyClass();
		
		m.method1();
		m.method2();
//		m.method3();

		MyInterface.method4();
	}
}
