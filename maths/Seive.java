package maths;

import java.util.Arrays;

public class Seive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 40;
		seiveOfEratosthenes(n);
		
		//auxiliary space = O(n)
		//time complexity = O(n * log(logn))
		

	}
	
	static void seiveOfEratosthenes(int n) {
		
		boolean[] prime = new boolean[n + 1];
		
		Arrays.fill(prime, true);
		
		for (int i = 2; i * i <= n; i++) {
			for (int j = i*2; j <= n; j+=i) {
				prime[j] = false;
			}
		}
		
		for (int i = 2; i <= n; i++) {
			if (prime[i])
				System.out.print(i + " ");
		}
	}

}
