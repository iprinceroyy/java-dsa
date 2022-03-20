package recursion;

import java.util.ArrayList;

public class Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subseqListAscii("","abc"));

	}


	static void subseq(String p, String up) {

		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}

		char ch = up.charAt(0);
		subseq(p, up.substring(1));
		subseq(p+ch, up.substring(1));
	}

	static ArrayList<String> subseqList(String p, String up) {

		ArrayList<String> list = new ArrayList<>();
		if (up.isEmpty()) { 
			list.add(p);
			return list;
		}

		char ch = up.charAt(0);
		list.addAll(subseqList(p, up.substring(1)));
		list.addAll(subseqList(p+ch, up.substring(1)));
		
		return list;
	}
	
	static ArrayList<String> subseqListAscii(String p, String up) {

		ArrayList<String> list = new ArrayList<>();
		if (up.isEmpty()) { 
			list.add(p);
			return list;
		}

		char ch = up.charAt(0);
		list.addAll(subseqListAscii(p, up.substring(1)));
		list.addAll(subseqListAscii(p+ch, up.substring(1)));
		list.addAll(subseqListAscii(p+(ch+0), up.substring(1)));
		
		return list;
	}

}
