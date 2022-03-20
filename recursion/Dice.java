package recursion;

import java.util.*;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dice("", 4));
	}
	
	static List<String> dice(String p, int target){
		
		List<String> list = new ArrayList<>();
		if (target == 0) {
			list.add(p);
			return list;
		}
		

		for (int i = 1; i <= 6 && i <= target; i++) {
			list.addAll(dice(p + i, target-i));
		}
		
		return list;
	}

}
