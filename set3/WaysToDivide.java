package set3;

import java.util.*;

public class WaysToDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> ans = countWays("", 6);
//		for (String s: ans) {
//			if (s.length() == 4) {
//				System.out.println(s);
//			}
//		}
		//System.out.println(countWays("", 8));
		//System.out.println(isSorted("1122", 0));
		System.out.println(count(8));
	}
	
	static List<String> countWays(String p, int n) {
		
		List<String> list = new ArrayList<>();
		if (n == 0 && p.length() == 4) {
			list.add(p);
			return list;
		}
		
		for (int i = 1; i <= n; i++) {
			list.addAll(countWays(p+i, n-i));
		}
		
		return list;
		
	}
	
	static int count(int n) {
		
		int count = 0;
		List<String> list = countWays("", n);
		for (int i = 0; i < list.size(); i++) {
			if (isSorted(list.get(i), 0)) {
				count++;
			}
				
		}
		return count;
		
	}
	
	static boolean isSorted(String s, int index) {
		
		if (index == s.length()-1) {
			return true;
		}
		
		return s.charAt(index) <= s.charAt(index+1) && isSorted(s, index+1);
	}

}
