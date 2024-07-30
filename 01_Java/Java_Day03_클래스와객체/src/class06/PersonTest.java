package class06;

public class PersonTest {
	public static void main(String[] args) {
		// 클래스를 가지고 객체를 생성
		// 클래스이름 객체의변수명= new 클래스이름();
		Person p = new Person();
						
		// 묵시적 형 변환 가능
		 p.study((byte)2);
		 p.study((short)10);
		 p.study('A');
 		 p.study(10); // 그 데이터와 연관된 메서드
		
 		 p.study(10L);
 		 p.study(10.3f);
 		 p.study(10.5);
 		 p.study("10");
	}
	

}
