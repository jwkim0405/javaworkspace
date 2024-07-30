public class Array08_실습 {
	public static void main(String[] args) {
		int [][] grid = {
				{2, 3, 1, 4, 7},
				{8, 13, 3, 33, 1},
				{7, 4, 5, 80, 12},
				{17, 9, 11, 5, 4},
				{4, 5, 91, 27, 7}
		};
		
		int sum = 0;
		int cnt = 0;
		out: for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] % 3 != 0) continue;
				sum += grid[i][j];
				cnt += 1;
			}
		}
		
		System.out.println("3의 배수 개수: " + cnt + "\n3의 배수 총합 : " + sum);
	}
}
