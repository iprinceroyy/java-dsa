package set4;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(root(40));

	}
	
	static double root(int n) {
		double x = n;
		double root;
		
		while (true) {
			root = 0.5 * (x + (n/x));
			
			if (Math.abs(root - x) < 0.5)
				break;
			x = root;
		}
		
		return Math.round(root*100.0)/100.0;
	}

}
