
public class Array3_90도회전 {
	public static void main(String[] args) {
		int num = 0;
		int[][] arr = new int[3][3];
		
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				arr[i][j] = ++num;
		

		
		for (int i = 0; i < 3; i++) { 
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int[][] nextArr = new int[3][3];
		
		// 90도 회전 배열
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				nextArr[i][j] = arr[2-j][i];
		
		System.out.println();		
		
		for (int i = 0; i < 3; i++) { 
			for (int j = 0; j < 3; j++) {
				System.out.print(nextArr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
