package set1;

import java.util.Arrays;

public class MinMaxChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minAndMax("ppprinceeeic");

	}
	
	static void minAndMax(String s) {
		
		int[] count = new int[256];
		
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}
		
		int max = -1;
		int min = Integer.MAX_VALUE;
		char res1 = ' ';
		char res2 = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (max < count[s.charAt(i)]) {
				max = count[s.charAt(i)];
				res1 = s.charAt(i);
			}
			
			if (min > count[s.charAt(i)]) {
				min = count[s.charAt(i)];
				res2 = s.charAt(i);
			}
		}
		
		System.out.println(res1);
		System.out.println(res2);
	}

}
