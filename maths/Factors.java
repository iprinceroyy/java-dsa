package maths;

import java.util.ArrayList;
import java.util.Arrays;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factor3(36);


	}

	//O(n)
	static void factor1(int n) {

		int i = 1;
		while (i <= n) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}

	//O(sqrt(n))
	static void factor2(int n) {

		int i = 1;
		while (i * i <= n) {
			if (n % i == 0) {
				if (n/i == i) {
					System.out.println(i);
				} else {
					System.out.print(i + " " + n/i + " ");
				}
			}
			i++;
		}
	}

	//time: O(sqrt(n)) space: O(sqrt(n))
	static void factor3(int n) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 1;
		while (i * i <= n) {
			if (n % i == 0) {
				if (n/i == i) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + " ");
					list.add(n/i);
				}
			}
			i++;
		}
		
		for (int j = list.size() - 1; j >= 0; j--){
			System.out.print(list.get(j) + " ");
		}
	}

}
