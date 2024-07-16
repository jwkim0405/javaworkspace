import java.util.Arrays;

public class Array03_배열의순회 {
	public static void main(String[] args) {
		int[] nums = {23, 12, 53, 47, 85};
		
		// 내부에서 idx를 활용할 일이 있다면!
		for (int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
		
		
		// for-each문
		// - read only
		for (int num : nums) 
			System.out.println(num);
		
		int[] newNums = Arrays.copyOf(nums, nums.length+1);
		System.out.println(Arrays.toString(newNums));
		
	}
}
