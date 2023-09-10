package Package1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prime number is one which cant be divided by anyother number, its divisible by 1 or itself
		int a = 4;
		boolean flag = false;
		for(int i = 2; i <= a/2; i++) {
			if(a%i==0) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.print("Not a prime");
		}else
		{
			System.out.print("prime");
		}
	}

}
