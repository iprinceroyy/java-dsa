package set2;

import java.util.Arrays;

public class ReverseOrder {

	public static void main(String[] args) {
		System.out.println(reverse("welcome to ITER"));
	}
	
	static String reverse(String s) {
		
		String[] ch = s.split("\s");
		String ans = "";
		
		int end = ch.length-1;
		while (end >= 0) {
			ans += ch[end] + " ";
			end--;
		}
		
		return ans;
	}
}
