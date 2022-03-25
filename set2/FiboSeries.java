package set2;

public class FiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fiboSeries(11);
	}
	
	static void fiboSeries(int n) {
		
		int a = 0, b = 1;
		System.out.print(a + " " + b + " ");
		int i = 2;
		while (i < n) {
			int c = a+b;
			a = b;
			b = c;
			System.out.print(c + " ");
			i++;
		}
	}

}
