package recursion;

import java.util.List;
import java.util.ArrayList;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		System.out.println(subsets(arr));

	}
	
	//time: O(n*2**n)
	//space: O(n*2**n)
	static List<List<Integer>> subsets(int[] arr){
		
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		
		for (int num: arr) {
			int n = outer.size();
			for (int i = 0; i < n; i++) {
				List<Integer> inner = new ArrayList<>(outer.get(i));
				inner.add(num);
				outer.add(inner);
				
			}
		}
		 
		return outer;
	}

}
