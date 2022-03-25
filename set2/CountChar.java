package set2;

import java.util.*;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("hello world"));

	}
	
	static LinkedHashMap<Character, Integer> count(String s){
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		s = s.replaceAll("\s", "");
		for (int i = 0; i < s.length(); i++) {
			 Integer c = map.get(s.charAt(i));
			
			if (c == null) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), c+1);
			}
		}
		
		return map;
	}

}
