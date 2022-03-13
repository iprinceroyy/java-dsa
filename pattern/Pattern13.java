package pattern;

/*
     *
    * *
   *   *
  *     *
 *********
 */

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}

	static void pattern(int n) {
		for (int row = 1; row <= n; row++) {

			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}


			for (int col = 1; col <= row; col++) {
				if ((row == 3 && col == 3) || (row == 4 && col == 2) || (row == 4 && col == 3))
					System.out.print("");
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
