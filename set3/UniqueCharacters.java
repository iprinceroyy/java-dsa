package set3;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countUnique("iit"));

	}
	
	static int countUnique(String s) {
		
		int count = 0;
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!str.contains(ch + "")) {
				str += ch;
				count++;
			}
		}
		
		//System.out.println(str);
		return count;
	}

}
