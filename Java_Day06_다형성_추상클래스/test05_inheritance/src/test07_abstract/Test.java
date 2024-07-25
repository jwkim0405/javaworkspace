package test07_abstract;

public class Test {
	public static void main(String[] args) {
//		Animal ani = new Animal();
		
		Animal[] animals = new Animal[3];
		// 이거 객체를 만들고 있는 것 아니라
		// 배열 만들고 있는 것
		
		
		animals[0] = new Cat("Luna", 3);
		animals[1] = new Dog("Max", 4);
		animals[2] = new Cow("Daisy", 2);

		for (Animal animal : animals) {
			animal.eat();
			animal.speak();
		}

		// 추상 메서드로 선언하게 되면
		// Animal 타입으로 참조했을 때
		// 해당 메서드가 목록에 보임
		// => 실행될 때는 실제 자식 클래스에서 오버라이드한 메서드가 실행.
		
	}
}
