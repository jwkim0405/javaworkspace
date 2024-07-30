
public class Array2_이진검색 {
	public static void main(String[] args) {
		
		int[] nums = {2, 4, 7, 9, 11, 19, 23, 30};
		System.out.println(binarySearch(nums, 7));
	}
	
	static int binarySearch(int[] arr, int key) {
		// left == right -> 구간 안에 데이터가 하나 있다 !!는 뜻
		
		int left = 0;	// 구간의 시작 index
		int right = arr.length-1;	// 구간의 끝 index
		while (left <= right) {
			int mid = (left + right) / 2;
			
			if (arr[mid] == key) // mid index의 값과 key값이 같을 때
				return mid;
			else if (arr[mid] < key) // key값이 더 클 때
				left = mid + 1;
			else 					 // key값이 더 작을 때
				right = mid - 1;
		}
		return -1;
	}
}
