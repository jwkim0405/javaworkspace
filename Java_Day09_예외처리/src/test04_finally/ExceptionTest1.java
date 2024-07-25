package test04_finally;

public class ExceptionTest1 {
	public static void main(String[] args) {
		
		// try ... catch ... finally
		// 1. 정상적으로 실행되는 경우 : 1 2 4 5


		int[] nums = {10};
		try {
			System.out.println("1");	
			nums[0] = 40;
			System.out.println("2");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("3"); 
		} finally {
			System.out.println("4");
		}
		System.out.println("5"); 
		
		System.out.println("===========");
		
		// 2. 예외 발생 & 처리가 되는 경우 : 1 3 4 5
		try {
			System.out.println("1");	
			nums[3] = 40;
			System.out.println("2");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("3"); 
		} finally {
			System.out.println("4");
		}
		System.out.println("5"); 
		
		System.out.println("===========");

		// 3. 예외 발생 & 처리가 안 되는 경우 : 1 4 (비정상적 종료)
//		try {
//			System.out.println("1");	
//			nums[0] = 40;
//			int i = 1 / 0;
//			System.out.println("2");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("3"); 
//		} finally {
//			System.out.println("4");
//		}
//		System.out.println("5"); 
//		
//		System.out.println("===========");
		
		// 4. 정상 실행 & try문에 return이 있는 경우 : 1 2 4
		try {
			System.out.println("1");	
			nums[0] = 40;
			int i = 1 / 1;
			System.out.println("2");
			return;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("3"); 
		} finally {
			System.out.println("4");
		}
		System.out.println("5"); 
	}

}
