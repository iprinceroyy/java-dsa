package search;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {25, 35, 89, 90, 12};
		int target = 88;
		int index = linearSearch(arr, target);
		if (index == -1)
			System.out.println("Item not found");
		else
			System.out.println("The index of the search item is " + index);

	}


	// search element in the array: return index if item found
	// else return -1
	static int linearSearch(int[] arr, int target) {

		if(arr.length == -1) 
			return -1;

		for (int index = 0; index < arr.length; index++) 
			if(arr[index] == target) return index;


		return -1;
	}

}
