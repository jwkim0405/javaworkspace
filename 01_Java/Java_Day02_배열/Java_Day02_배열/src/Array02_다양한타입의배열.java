
public class Array02_다양한타입의배열 {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		double[] doubleArray = new double[5];
		char[] charArray = new char[5];
		boolean[] boolArray = new boolean[5];
		String[] strArray = new String[5];
		
		System.out.println(intArray[0]);	// 0
		System.out.println(doubleArray[0]);	// 0.0
		System.out.println(charArray[0]);	// 공백문자
		System.out.println(boolArray[0]);	// false
		System.out.println(strArray[0]);	// null
	}
}
