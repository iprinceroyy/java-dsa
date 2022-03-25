package set3;

import java.util.*;

public class KeithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(number(245));

	}
	
	static int number(int n) {
		
		List<Integer> list = new ArrayList<Integer>();
		while (n > 0) {
			list.add(n%10);
			n /= 10;
		}
		
		//Collections.sort(list);;
		//System.out.println(list);
		//return -1;
		int ans = 0;
		for (int i = list.size()-1; i >= list.size()-3; i--) {
			ans += list.get(i);
		}
		
		return ans;
		
 	}

}
