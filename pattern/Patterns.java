package pattern;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern30(5);
	}
	
	
	static void pattern2(int n) {
		
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = n; col >= row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern4(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	
	static void pattern5(int n) {
		for (int row = 1; row <= 2 * n ; row++) {
			
			int totalColInRow = row > n ? 2 * n - row: row;
			
			for (int col = 1; col <= totalColInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern28(int n) {
		for (int row = 1; row <= 2 * n; row++) {
			int totalColInRow = row > n? 2 * n - row: row;
			
			int spaces = n - totalColInRow;
			
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			
			for (int col = 1; col <= totalColInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern30(int n) {
		for (int row = 1; row <= n; row++) {
			
			for (int space = 1; space <= n - row; space++) {
				System.out.print("  ");
			}
			
			//for 1st half col
			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			
			
			//for 2nd half col 
			for (int col = 2; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
