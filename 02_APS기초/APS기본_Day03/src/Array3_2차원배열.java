import java.util.Arrays;

public class Array3_2차원배열 {
	public static void main(String[] args) {
		
		// 2차원 배열의 선언 및 초기화
//		int[][] arr = {{1, 2, 3}, {4,5,6}, {7,8,9}};
		int[][] arr = new int[3][3];
		
		int r, c;
		int num = 0;
		
		// 정방향 우선순회하면서 초기화
		for (r = 0; r < arr.length; r++) 
			for (c = 0; c < arr[r].length; c++) 
				arr[r][c] = ++num;

		
		System.out.println(Arrays.deepToString(arr));
		for (c = 0; r < arr[r].length; c++) 
			for (r = 0; c < arr.length; r++) 
				System.out.print(arr[r][c] + " ");
		
		
	}
	
}
