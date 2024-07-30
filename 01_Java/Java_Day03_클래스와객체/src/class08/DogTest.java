package class08;

public class DogTest {
	public static void main(String[] args) {

		// 생성자에도 매개변수가 올 수 있다.
		// 생성자: 멤버필드를 초기화하는 데 사용
		// 프로그래머가 생성자를 하나라도 만든다면,
		// 컴파일러는 기본생성자를 추가하지 않는다.
		
//		Dog d = new Dog("메리", 4);
//		System.out.println(d.name);
//		System.out.println(d.age);
//		
//
//		Dog d2 = new Dog("체리");	
//		System.out.println(d2.name);
//		System.out.println(d2.age);
//		d2.eat().drink();
		
		Dog d = new Dog(3);
//		System.out.println(d.name);
//		System.out.println(d.age);
		d.Dog('A');
	}
}
