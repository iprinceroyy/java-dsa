package recursion;

public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);
	}

	static void fun(int n) {

		if (n == 0)
			return;

		fun(n-1);
		System.out.println(n);
	}

}
