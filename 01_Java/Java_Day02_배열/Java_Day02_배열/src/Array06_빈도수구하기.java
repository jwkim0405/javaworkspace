import java.util.Iterator;

public class Array06_빈도수구하기 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 9, 8, 7, 3, 5, 3, 3};
		
		// 갯수를 세는 배열을 만들자
		// - 해당 인덱스를 해당 숫자를 나타내는 개념으로 활용하자
		// - 1~9까지의 숫자를 활용해야하므로 크기가 10인 배열을 만든다.
		int[] count = new int[10];
		// count[1] : 1번 숫자가 출현한 횟수 = 0
		// count[2] : 2번 숫자가 출현한 횟수 = 0
		// ...
		// count[9] : 9번 숫자 출현한 횟수 = 0
		for (int i = 0; i < nums.length; i++)
			count[nums[i]]++;
		
		for (int i = 1; i < count.length; i++)
			System.out.println(i + "의 개수: " + count[i]);
		
	}
}
