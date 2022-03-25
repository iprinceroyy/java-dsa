package set4;

import java.util.*;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterPrime();
	}

	static void CounterPrime() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		boolean[] primes = new boolean[n+1];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;

		for (int i = 2; i * i <= n; i++) {
			for (int j = i*2; j <= n; j+=i) {
				primes[j] = false;
			}
		}

		for (int i = 0; i < primes.length; i++) {
			if (primes[i])
				System.out.print(i + " ");
		}


	}

}
