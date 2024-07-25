package test02_try_catch;

public class ExceptionTest3 {
	public static void main(String[] args) {
		int[] nums = {10};
		
		try {
			System.out.println("정상 코드 1");	// (1) 정상 코드
			System.out.println(nums[3]);	// (2) 예외 발생 가능한 코드
			int i = 1 / 0;
			System.out.println("정상 코드 2");// (3) 정상 코드
		} catch(Exception e) {
			System.out.println(e.getMessage()); // (4) 예외처리 코드
			e.printStackTrace();
		}
		System.out.println("프로그램 종료"); // (5) 정상 코드
	}
}
