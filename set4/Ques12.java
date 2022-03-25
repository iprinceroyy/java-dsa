package set4;

public class Ques12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert(12));
	}
	
	static int convert(int n) {
		
		StringBuilder s = new StringBuilder();
		
		if (n == 0) s.append(0);
		
		while (n > 0) {
			s.append(n%8);
			n /= 8;
		}
		s.reverse();
		return Integer.parseInt(s+"");
	}

}
