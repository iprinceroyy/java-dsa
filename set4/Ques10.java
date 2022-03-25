package set4;

import java.util.*;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twins();
	}
	
	static void twins() {
		
		Map<Integer, Integer> hm = new LinkedHashMap<>();
		
		int i = 0, n = 2;
		while (i < 1000) {
			if (isPrime(n) && isPrime(n + 2)) {
				hm.put(n, n+2);
				i++;
			}
			
			n++;
		}
		
		//System.out.println(hm.size());
		for (Map.Entry<Integer, Integer>it: hm.entrySet()) {
			System.out.println(it.getKey() + " " + it.getValue());
			
		}
	}
	
	static boolean isPrime(int n) {
		
		if (n < 2) return false;
		
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) return false;
			i++;
		}
		return true;
	}

}
