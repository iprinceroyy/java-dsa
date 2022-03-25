package set3;

import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println((numberPermutation("", 123)));
		List<String> ans = (numberPermutation("", 1243));
		System.out.println(largest(ans));
	}
	
	static List<String> numberPermutation(String p, int digit){
		
		List<String> list = new ArrayList<>();
		if (digit == 0) {
			list.add(p);
			return list;
		}
		
		int r = digit % 10;
		
		for (int i = 0; i <= p.length(); i++) {
			String first = p.substring(0, i);
			String second = p.substring(i);
			list.addAll(numberPermutation(first+r+second, digit/10));
		}
		
		return list;
	}
	
	static int largest(List<String> list) {
		
		int largest = 0;
		for (int i = 0; i < list.size(); i++) {
			if (Integer.parseInt(list.get(i)) > largest)
				largest = Integer.parseInt(list.get(i));
		}
		
		return largest;
	}
	

}
