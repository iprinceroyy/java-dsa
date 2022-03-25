package set3;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);

	}
	
	static void pattern(int n) {
		
		for (int row = 1; row < 2 * n; row++) {
			int noOfCol = row > 5? 2*n-row: row;
			
			for (int spaces = 1; spaces <= n-noOfCol; spaces++) 
				System.out.print(" ");
			
			for (int col = 1; col <= noOfCol; col++) {
				System.out.print(col+ "");
			}
			
			for (int col = noOfCol-1; col >= 1; col--) {
				System.out.print(col + "");
			}
			
			System.out.println();
		}
	}

}
