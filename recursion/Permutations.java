package recursion;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//permutations("", "abc");
		System.out.println(permutations1("", "abc"));
		System.out.println(countPermutations("", "abc"));
		
	}
	
	static void permutations(String p, String up) {
		
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			permutations(f+ch+s, up.substring(1));
		}
	}
	
	static ArrayList<String> permutations1(String p, String up){
		
		ArrayList<String> list = new ArrayList<>();
		if (up.isEmpty()) {
			list.add(p);
			return list;
		}
		
		char ch = up.charAt(0);
		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			list.addAll(permutations1(f+ch+s, up.substring(1)));
		}
		return list;
	}
	
	static int countPermutations(String p, String up) {
		
		if (up.isEmpty()) return 1;
		
		int count = 0;
		char ch = up.charAt(0);
		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			count += countPermutations(f+ch+s, up.substring(1));
		}
		
		return count;
	}

}
