package search;

import java.util.*;

public class searchInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "prince";
		char ch = 'p';
		System.out.println(search2(str, ch));
		System.out.println(Arrays.toString(str.toCharArray()));


	}

	static boolean search2(String str, char target) {

		if (str.length() == 0) return false;

		for (char ch: str.toCharArray()) {
			if (ch == target) 
				return true;
		}
		
		return false;
	}

	//	static boolean search(String str, char target) {
	//		
	//		if (str.length() == 0) return false;
	//		
	//		for (int i = 0; i < str.length(); i++) {
	//			if (target == str.charAt(i)) return true;
	//		}
	//		
	//		
	//		return false;
	//	}
	//	



}
