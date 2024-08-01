import java.util.Arrays;

public class Array3_연습문제1 {
	public static void main(String[] args) {
//		int[][] arr = {
//					{1, 2, 3, 4, 5},
//					{6, 7, 8, 9, 100},
//					{15, 14, 13, 12 ,11},
//					{25, 10, 8, 4, 2},
//					{1, 11, 111, 11, 2}
//				};
		
		int[][] board = new int[5][5];
		
		// 델타 배열
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		
		int[][] sum = new int[5][5];
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = (int) (Math.random() * 100);	
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				for (int k = 0; k < 4; k++) {
					int nr = i + dr[k];
					int nc = j + dc[k];
					if (nr >= 0 && nr < 5 && nc >= 0 && nc < 5)
						sum[i][j] += Math.abs(board[i][j] - board[nr][nc]);
			
				}
			}
				
		}
		
		System.out.println(Arrays.deepToString(board));
		System.out.println(Arrays.deepToString(sum));
	}
}
