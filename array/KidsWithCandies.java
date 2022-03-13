package array;

import java.util.*;

public class KidsWithCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 2, 1, 1, 2};
		List<Boolean> ans = kidsWithCandies(arr, 1);
		System.out.println(ans.toString());

	}

	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> res = new ArrayList<>();

		int max = candies[0];
		for (int candy: candies) 
			if (candy > max) max = candy;


		for (int candy: candies) 
			res.add(candy + extraCandies >= max);


		return res;
	}


}
