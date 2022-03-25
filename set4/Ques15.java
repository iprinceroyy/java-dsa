package set4;

public class Ques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "acb";
		System.out.println(sort(s));
	}

	static String sort(String s) {
		
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 1; j < s.length(); j++) {
				if (ch[j] < ch[j-1] ) {
					swap(ch, j, j-1);
				}
			}
		}
		
		return new String(ch);

	}
	
	static void swap(char[] ch, int f, int l) {
		char temp = ch[f];
		ch[f] = ch[l];
		ch[l] = temp;
	}
}
