package set2;

public class ThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {13, 45, 22, 10, 8, 20};
		System.out.println(thirdLargest(arr));

	}
	
	static int thirdLargest(int[] arr) {
		
		int first = arr[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				third = second;
				second = arr[i];
			} else if (arr[i] > third) {
				third = arr[i];
			}
		}
		
		return third;
	}

}
