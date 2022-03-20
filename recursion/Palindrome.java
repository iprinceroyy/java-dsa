package recursion;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome2("wow", 0, 2));
	}
	
	static boolean isPalindrome1(int n) {
		
		return n == ReverseNumber.reverse1(n);
	}
	
	static boolean isPalindrome2(String str, int start, int end) {
		
		if (start < end)
			return str.charAt(start) == str.charAt(end);
			
		return isPalindrome2(str, ++start, --end);
	}

}
