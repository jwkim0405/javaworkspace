import java.util.Scanner;

public class Array3_델타배열 {
	
	// 상 하 좌 우 
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	static void printMap(int[][] map) {
		
	}
	
	static int[][] map = new int[5][5];
	static int r = 2;
	static int c = 2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printMap();
		
		while(true) {
			System.out.println("어디로 이동할까?");
			int d = sc.nextInt();
		
			r = r + dr[d];
			c = c + dc[d];
			
			printMap();
		}
		
	}
	
	static void printMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (r == i && c == j)
					System.out.print('X');
				else
					System.out.print('O');
			}
			System.out.println();
		}
		
		
	}
}
