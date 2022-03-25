package set2;

public class DuplicateString {

	public static void main(String[] args) {
		String s = "csharpcorner";
		System.out.println(remove(s));
		
	}
	
	static String remove(String s) {
		
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!ans.contains(ch + "")) {
				ans += s.charAt(i);
			}
		}
		
		return ans;
	}
}
