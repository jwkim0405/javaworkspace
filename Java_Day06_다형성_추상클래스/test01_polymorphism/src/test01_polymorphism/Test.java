package test01_polymorphism;

public class Test {
    public static void main(String[] args) {
    	// 다형성
    	// 1. 상속 관계에 있을 때,
    	//	조상 클래스의 타입으로, 자손 클래스의 객체를 참조할 수 있다.
    	
    	Student st = new Student();
    	Person p = new Student();
    	Object obj = new Student();

    	// 관점을 바꾼다고 하여도, 실제 메모리에 생성된 인스턴스는 변함이 없음.
        // 관점만 바뀐 것임(접근 범위만 달라졌다) 
    
    
    	// 2. 동적 바인딩
    	// - 상속을 하면서, 자손 클래스에서 오버라이드 한 상황
    	
    	st.eat();
    	p.eat();  // Person으로 받았지만 st형태로 출력된다.
    
    	// 학생을 사람이라는 박스에 넣었더라도, 여전히 학생
    	// 소, 개, 고양이 => 동물이라는 박스에 넣어도
    	// 각각은 여전히 소, 개, 고양이다!
    	
    	}
}
