package recursion;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, -1, 8, 22};
		System.out.println(findIndex(arr, 1, 0));

	}

	static boolean find(int[] arr, int target, int index) {

		if (index == arr.length)
			return false;
		
		return arr[index] == target || find(arr, target, ++index);
	}
	
	static int findIndex(int[] arr, int target, int index) {
		
		if (index == arr.length)
			return -1;
		
		if (arr[index] == target)
			return index;
		return findIndex(arr, target, ++index);
		
	}

}
