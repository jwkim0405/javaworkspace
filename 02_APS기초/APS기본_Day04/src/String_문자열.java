
public class String_문자열 {
	public static void main(String[] args) {
		
		// 문자열의 초기화
		
		// 1.리터럴 표기 방식
		// 힙 영역에서 문자열 상수 pool에 "Hello"가 저장됨.
		String lStr1 = "Hello";
		String lStr2 = "Hello";
		
		// 2. new 연산자 사용 방식
		// 힙 영역에서 각각의 객체가 생성됨.
		String str1 = new String("Hello");
		String str2 = new String("Hello");		
		
		// == 비교: 주소값 비교
		System.out.println(lStr1 == lStr2);	// true
		System.out.println(str1 == str2);	// false
		
		// 값 비교
		System.out.println(lStr1.equals(lStr2));
		System.out.println(str1.equals(str2));
	}
}
