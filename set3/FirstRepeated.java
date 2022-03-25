package set3;

public class FirstRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 4, 5, 5, 5, 7, 9};
		System.out.println(firstRepeated(arr));
	}
	
	static int firstRepeated(int[] arr) {
		
		int ans = 0;
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] == arr[j]) {
				ans = arr[i];
			}
		}
		
		return ans;
	}

}
