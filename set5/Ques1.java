package set5;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("12367494938929"));
	}
	
	static boolean isValid(String s) {
		
		String regExp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		return s.matches(regExp);
	}

}
