package array;

import java.util.Arrays;

public class ConcatArray {

	public static void main(String[] args) {
		int[] arr = {1, 3, 2};
		int[] ans = getConcatenation(arr);

		System.out.println(Arrays.toString(ans));

	}

	static int[] getConcatenation(int[] nums) {

		int n = nums.length;
		int[] ans = new int[n << 1];

		for (int i = 0; i < n; i++){
			ans[i] = nums[i];
			ans[i+n] = nums[i];
		}

		return ans;
	}



}
