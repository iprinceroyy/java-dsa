package set4;

import java.util.*;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factors(120));
	}
	
	static List<Integer> factors(int n){
		
		List<Integer> list = new ArrayList<>();
		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				list.add(i);
				n /= i;
			} else i++;
		}
		
		return list;
	}

}
