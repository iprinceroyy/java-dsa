package pattern;

/*
 * * * * *
  * * * *
   * * *
    * *
     *
 */

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}
	
	static void pattern(int n) {
		for (int row = 1; row <= n; row++) {
			
			for (int space = 1; space < row; space++) {
				System.out.print(" ");
			}
			
			for (int col = n; col >= row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
