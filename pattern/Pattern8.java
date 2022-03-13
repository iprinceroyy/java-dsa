package pattern;

/*
 		*
       ***
      *****
     *******
    *********
 */

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern8(5);

	}
	
	static void pattern8(int n) {
		for (int row = 1; row <= n; row++) {
			
			for (int space = 1; space <= n - row; space++) {
				System.out.print("  ");
			}
			
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			
			for (int col = 2; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

}
