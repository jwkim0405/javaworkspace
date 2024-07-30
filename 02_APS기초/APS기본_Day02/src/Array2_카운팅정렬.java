import java.util.Arrays;

public class Array2_카운팅정렬 {
	public static void main(String[] args) {
		int[] arr = {0, 4, 1, 3, 1, 2, 4, 1};
		arr = countingSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static int[] countingSort(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (max < arr[i])
				max = arr[i];
		
		int[] cnt = new int[max+1];		// 원소의 최대 크기 +1만큼 배열 생성
		
		// 각 원소별 개수 - 배열에 저장(인덱스 == 숫자, 배열의 값 == 숫자의 개수)
		for (int i = 0; i < arr.length; i++)
			cnt[arr[i]]++;

		// 누적합
		int[] cumulativeSum = new int[max+1];	// 마찬가지로, 인덱스와 숫자의 개념이 동일
		
		for (int i = 0; i < max+1; i++) {
			if (i == 0) {
				cumulativeSum[i] = cnt[i];
				continue;
			}
			cumulativeSum[i] = cumulativeSum[i-1] + cnt[i];
		}
					
		// 정렬한 배열
		int new_arr[] = new int[arr.length];
		
		for (int i = arr.length - 1; i >= 0; i--)
			new_arr[--cumulativeSum[arr[i]]] = arr[i];
		
		return new_arr;
	}
}
