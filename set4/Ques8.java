package set4;

import java.util.*;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printAllPerfect());
		
	}


	static List<Integer> printAllPerfect(){
		
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 500; i++) {
			if (isPerfectNum(i))
				list.add(i);
		}
		
		return list;
	}
	
	static boolean isPerfectNum(int n) {

		List<Integer> list = factors(n);
		
		int sum = 0;
		for (Integer i: list)
			sum += i;
		return sum == n;
	}

	static List<Integer> factors(int n){

		List<Integer> list = new ArrayList<>();

		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				list.add(i);
				if (n/i != i)
					list.add(n/i);
			}
			i++;

		}
		list.add(1);
		Collections.sort(list);
		return list;
	}

}
