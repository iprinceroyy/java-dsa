package set2;

import java.util.*;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(substring("abcd"));
		
	}
	
	static List<String> substring(String up) {
		
		List<String> list = new ArrayList<>();
		for (int i = 0; i < up.length(); i++) {
			for (int j = i+1; j < up.length(); j++) {
				list.add(up.substring(i, j+1));
			}
		}
		
		return list;
		
	}
	
	

}
