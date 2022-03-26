package set3;

import java.util.*;

public class LargestFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factors(96));
		//System.out.println(isFacto(24));

	}
	
	static int factors(int n){
		
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) list.add(i);
		}
		//
		System.out.println(list);
		return largestFacto(list);
	}
	
	static int largestFacto(List<Integer> list) {
		
		int largest = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > largest && isFacto(list.get(i)))
				largest = list.get(i);
		}
		
		return largest;
	}
	
	static boolean isFacto(int n) {
		
		int i = 1;
		int facto = 1;
		while (facto < n) {
			facto *= i;
			i++;
		}
		
		return facto == n;
	}

}
