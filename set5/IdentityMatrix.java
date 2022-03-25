package set5;

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{1, 0, 0},
				{0, 1, 0},
				{0, 0, 1}
		};
		System.out.println(isIdentity(matrix));
	}
	
	static boolean isIdentity(int[][] arr) {
		
		int i = 0;
		while (i < arr.length) {
			if (arr[i][i] != 1) 
				return false;
			i++;
		}
		
		return true;
	}

}
