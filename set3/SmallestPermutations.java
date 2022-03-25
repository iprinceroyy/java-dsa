package set3;

import java.util.*;

public class SmallestPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(smallest(5341));
	}
	
	static int smallest(int n) {
		List<String> list = permutations("", n);
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (Integer.parseInt(list.get(i)) < smallest)
				smallest = Integer.parseInt(list.get(i));
		}
		
		return smallest;
	}
	
	static List<String> permutations(String p, int digit){
		
		List<String> list = new ArrayList<>();
		if (digit == 0) {
			list.add(p);
			return list;
		}
		
		int n = digit % 10;
		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i);
			list.addAll(permutations(f+n+s, digit/10));
		}
		
		return list;
	}

}
