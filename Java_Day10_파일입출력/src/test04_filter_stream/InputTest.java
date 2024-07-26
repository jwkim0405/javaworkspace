package test04_filter_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// InputStreamReader : byte -> character로 받겠다
		
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) 
			nums[i] = Integer.parseInt(br.readLine());
	System.out.println(Arrays.toString(nums));
	}
	
}
