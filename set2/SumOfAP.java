package set2;

public class SumOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfAP(8));
	}
	
	static int sumOfAP(int terms) {
		
		if ((terms & 1) == 0) return -terms;
		
		return terms;
	}

}
