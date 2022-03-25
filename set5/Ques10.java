package set5;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "raceca";
		System.out.println(isPalindrome(s, 0, s.length()-1));

	}
	
	static boolean isPalindrome(String s, int start, int end) {
		
		if (start == end) return true;
		
		return s.charAt(start) == s.charAt(end) && isPalindrome(s, ++start, --end);
	}

}
