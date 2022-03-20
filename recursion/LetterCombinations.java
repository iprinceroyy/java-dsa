package recursion;

import java.util.*;

public class LetterCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pad("", "12"));

	}
	
	static List<String> pad(String p, String up){
		
		List<String> list = new ArrayList<String>();
		if (up.isEmpty()) {
			list.add(p);
			return list;
		}
		
		int digit = up.charAt(0) - '0';
		for (int i = (digit - 1) * 3; i < digit * 3; i++) {
			char ch = (char)(97+i);
			list.addAll(pad(p+ch, up.substring(1)));
		}
		
		return list;
		
		
	}

}
