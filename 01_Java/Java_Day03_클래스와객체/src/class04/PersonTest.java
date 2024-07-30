package class04;

public class PersonTest {
	public static void main(String[] args) {
		// 클래스를 가지고 객체를 생성
		// 클래스이름 객체의변수명= new 클래스이름();
		Person yang = new Person();
		
		yang.name = "Yang";
		yang.age = 45;
		yang.hobby = "YouTube";
		
		Person kim = new Person();
		kim.name = "Jeonegwoo";
		kim.age = 26;
		kim.hobby = "Running";
		
//		System.out.println("안녕하세요, " + kim.name + "입니다. 저는 "+ kim.age + "세, " + kim.hobby + "을 좋아합니다.");
		
		info(kim.name, kim.age, kim.hobby);
		info(yang.name, yang.age, yang.hobby);
	}
	
	public static void info(String name, int age, String hobby) {
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "입니다.");
		System.out.println("취미는 " + hobby +  "입니다.");
	}
}
