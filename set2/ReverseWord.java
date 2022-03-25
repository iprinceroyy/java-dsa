package set2;

import java.util.Arrays;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to iter";
		//System.out.println(reverseEachWord(s));
		System.out.println(reverseEachWord(s));
		
		

	}
	
	static String reverseEachWord(String s) {
		
		String[] arr = s.split(" ");
		StringBuilder revWord = new StringBuilder();
		
		for (String w: arr) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			revWord.append(sb + " ");
		}
		
		return "" + revWord;
	}
	
	
	
	

}
