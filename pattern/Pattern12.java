package pattern;

/*
 
* * * * *
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *

*/

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}
	
	static void pattern(int n) {
		for (int row = 1; row <= 10; row++) {
			
			int colsInRow = row > n? (n - row) * -1: n - row + 1;
			
			int spaces = n - colsInRow;
			
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			
			for (int col = 1; col <= colsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
