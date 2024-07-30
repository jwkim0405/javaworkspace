package test02_polymorphism;

public class Test {
	// 인터페이스와 다형성
	// 인터페이스: 타입으로도 사용 가능
	// 해당 인터페이스를 구현한 클래스로 만든 객체를, 해당 인터페이스로 참조할 수 있다.
	
	public static void main(String[] args) {
		AlarmSound galaxyPhone = new GalaxyPhone();
		AlarmSound iPhone = new IPhone();
		galaxyPhone.playAlarm();
		iPhone.playAlarm();	
		
	}
}
