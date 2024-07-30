package test01_class_diagram;

class B {
	A a;
}

class C {
	
}

class D {
	
}

class E {
	
}

class F {
	void method() {
		System.out.println("f");
	}
}

public class A {
	B b;	// 멤버 변수로 가지고 있음 : A와 B는 연관된다.
	C c;	// 양방향 연관 : A와 C는 서로를 가지고 있다. 서로 연관된다.
	D[] d;	// 집합 : A는 D의 집합을 가지고 있다. A는 D없이도 존재 가능하다.
	E[] e;	// 구성 : A는 E로 구성된다. A는 E가 없으면 존재 불가능하다.
	
	void method() {
		F f = new F();	// A는 F에 의존한다.
		f.method();
	}
}
