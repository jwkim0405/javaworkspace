package class03;

import java.util.Random;

public class FunctionTest {
	public static void main(String[] args) {
		System.out.println("아침 기상");
		이동("지하철", "멀캠");
		boolean 과제 = 교육();
		System.out.println();
		이동("지하철", "집");
		if (과제)
			System.out.println("과제를 해결한다!");
		System.out.println("저녁 식사");
		System.out.println("취침");
	}
	
	// 함수
	// - 관련된 문장들을 하나로 묶은 것
	// - 다른 곳에서 호출할 때는 : 함수이름()

	// 함수의 반환값.
	// void: 이 함수는 반환값이 없음
	// 반환형 함수이름() {}
	// return 반환값; // 나를 호출한 곳으로 돌아간다.

	public static boolean 교육() {
		System.out.println("오전 수업");
		System.out.println("점심 식사");
		System.out.println("오후 수업");
		
		Random random = new Random();
		
		return random.nextBoolean();
	}
	
	// 함수의 매개변수
	// 함수를 호출할 때는 값을 넣어서 호출할 수 있다.
	// - 유연한 대응이 가능
	public static void 이동(String 장소, String 탈것) {
		System.out.printf("%s타고 %s으로 이동\n", 탈것, 장소);
	}
	

}
