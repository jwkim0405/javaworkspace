import java.util.Scanner;

public class SWEA_2068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int max = 0;	// 최대값 저장
			for (int j = 0; j < 10; j++) {
				int num = sc.nextInt();
				max = Math.max(max, num);  // 현재 최대값과 새로 입력받은 값 비교 후 업데이트
			}
			System.out.println("#" + i + " " +  max); // 테스트 케이스 내 최대값 반환
		}
		
	}
}
