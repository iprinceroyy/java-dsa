package search;

public class MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {34, 12, 67, -3, 90};
		System.out.println(min(arr));

	}
	
	//asume array is not empty
	static int min(int[] arr) {
				
		int min = Integer.MAX_VALUE;
		for (int element: arr) {
			if (element < min)
				min = element;
			
		}
		
		return min;
	}
}
