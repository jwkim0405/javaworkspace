import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1984 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int[] ary = new int[10];
			int sum = 0;
			
			for (int j = 0; j < 10; j++) {
				ary[j] = sc.nextInt();
				sum += ary[j];
			}
			
			double Avg = (sum - ary[0] - ary[9]) / 10; 	
			
			System.out.printf("#%d %.1f\n", i, Avg);

		}
	}
}
