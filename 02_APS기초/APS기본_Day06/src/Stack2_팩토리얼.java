
public class Stack2_팩토리얼 {
	public static void main(String[] args) {
		System.out.println(factorial1(10));
		System.out.println(factorial2(10));
	}
	
	static int factorial1(int N) {
		// 1부터 N까지의 곱을 return
		int result = 1;
		for (int i = 1; i <= N; i++)
			result *= i;
		
		return result;
	}
	
	static int factorial2(int N) {
		if (N == 0 || N == 1)	// 기저 조건(base case, 재귀 호출에서 빠져나가기 위한 조건)
			return 1;
		else // 
			return N * factorial2(N-1);
	}
}
