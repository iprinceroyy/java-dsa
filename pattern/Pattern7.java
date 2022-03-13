package pattern;

/*
*****
 ****
  ***
   **
    *
*/
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern7(5);

	}
	
	static void pattern7(int n) {
		
		for (int row = 1; row <= n; row++) {
			
			for (int space = 0; space < row; space++) {
				System.out.print("  ");
			}
			
			 for (int col = n; col >= row; col--) {
				 System.out.print("* ");
			 }
			 System.out.println();
			
		}
	}

}
