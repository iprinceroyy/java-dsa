package set5;

public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1, 2, 3},
				{0, 7, 4},
				{6, 0, 0}
		};
		System.out.println(isSparse(arr));
		
	}
	
	static boolean isSparse(int[][] arr) {
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 0)
					count++;
			}
		}
		
		return count > arr.length*2/2;
	}

}
