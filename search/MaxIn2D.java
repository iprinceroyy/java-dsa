package search;

public class MaxIn2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{23, 56},
				{90},
				{45, 78, 103, -90}
		};
		int ans = maxIn2D(arr);
		System.out.println(ans);
	}

	//assuming array is not empty
	static int maxIn2D(int[][] arr) {

		int max = Integer.MIN_VALUE;
		for (int[] array: arr) {
			for (int element: array) {
				if (element > max) max = element;
			}
		}

		return max;
	}

}
