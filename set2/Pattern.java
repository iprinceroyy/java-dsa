package set2;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);

	}
	
	static void pattern(int n) {
		
		for (int row = 1; row <= n; row++) {
			
			for (int spaces = n; spaces > row; spaces--) {
				System.out.print("  ");
			}
			
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			
			for (int col = row-1; col > 0; col--) {
				System.out.print(col + " ");
			}
			
			System.out.println();
		}
	}

}
