package set4;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-43));
	}
	
	static int reverse(int n) {
		
		int num = n;
		if (n < 0) n *= -1;
		
		int revNum = 0;
		while (n > 0) {
			revNum = revNum*10 + n%10;
			n /= 10;
		}
		
		return num > 0? revNum: -revNum;
	}

}
