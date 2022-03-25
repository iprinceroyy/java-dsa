package set4;

import java.util.*;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factors(220));
		System.out.println(isAmi(220, 284));
	}

	static boolean isAmi(int a, int b) {

		List<Integer> factorsOfA = factors(a);
		List<Integer> factorsOfB = factors(b);

		int sum1 = 0;
		int sum2 = 0;
		for (Integer i: factorsOfA) {
			sum1 += i;
		}

		for (Integer i: factorsOfB) {
			sum2 += i;
		}

		return sum1 == b && sum2 == a;

	}

	static List<Integer> factors(int n){

		List<Integer> list = new ArrayList<>();

		int i = 2;
		while (i * i < n) {
			if (n % i == 0) {
				list.add(i);
				list.add(n/i);
			}
			i++;

		}
		list.add(1);
		Collections.sort(list);
		return list;
	}

}
