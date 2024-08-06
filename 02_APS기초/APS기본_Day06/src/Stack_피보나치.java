
public class Stack_피보나치 {
	static int[] arr = new int[100];
	static {
		arr[0] = 0;
		arr[1] = 1;
	}
	
	public static void main(String[] args) {
		int start_time = (int) System.nanoTime();
		System.out.println("재귀호출로 피보나치 40번째 수 구하기: " +fibo(40));
		int end_time = (int) System.nanoTime();
		
		int elapsedTime = end_time - start_time;
		System.out.println("elapsedTime: " + elapsedTime);

		start_time = (int) System.nanoTime();
		System.out.println("반복문으로 피보나치 40번째 수 구하기: " + fibo_dp(40));
		end_time = (int) System.nanoTime();
		elapsedTime = end_time - start_time;
		System.out.println("elapsedTime: " + elapsedTime);
	}
	
	static int fibo(int N) {
		if (N <= 1)
			return N;
		return fibo(N-1) + fibo(N-2);
	}
	
	static int fibo_dp(int N) {
		for (int i = 2; i <= N; i++)
			arr[i] = arr[i-1] + arr[i-2];
		return arr[N];
	}
	
	static int 
}


