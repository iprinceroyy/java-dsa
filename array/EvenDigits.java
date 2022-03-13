package array;

public class EvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {12,345,2,6,7896};
		int ans = findNumbers(nums);
		System.out.println(ans);

	}
	
	static int findNumbers(int[] nums) {
		int count = 0;
		
		for (int element : nums) {
			if (even(element)) {
				count++;
			}
		}
		
		return count;
	}
	
	static boolean even(int num) {
		return (numOfDigits(num) & 1) == 0;
	}
	
	static int numOfDigits(int num) {
		if (num < 0)
			num *= -1;
		
		return (int)Math.log10(num) + 1;  //log10(num)+1 returns number of digits
	}
}
