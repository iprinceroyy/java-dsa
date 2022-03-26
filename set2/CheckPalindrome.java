package set2;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("step on no pets"));

	}
	
	static boolean isPalindrome(String s) {
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		StringBuilder revStr = new StringBuilder();
		for (int i = s.length()-1; i >= 0; i--) {
			revStr.append(s.charAt(i));
		}
		
		return s.equals(revStr+"");
	}

}
