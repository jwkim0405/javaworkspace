package class05;

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
				
		kim.info(); // 그 데이터와 연관된 메서드
		
	}
	

}
