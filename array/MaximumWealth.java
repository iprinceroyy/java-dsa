package array;

public class MaximumWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts = {
				{1,5},
				{7,3},
				{3,5}
		};
		
		System.out.println(maxWealth(accounts));

	}

	static int maxWealth(int[][] accounts) {
		int count = 0;
		int maxCount = Integer.MIN_VALUE;
		for (int[] arr: accounts) {
			for (int element: arr) {
				count += element;
			}
			maxCount = Math.max(maxCount, count);
			count = 0;
		}

		return maxCount;
	}

}
