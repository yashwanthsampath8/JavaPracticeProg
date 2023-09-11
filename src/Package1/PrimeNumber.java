package Package1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prime number is one which cant be divided by anyother number, its divisible by 1 or itself
		for(int i = 2; i<10; i++) {
			if(!checkPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean checkPrime(int n) {
		boolean flag = false;
		for(int i = 2; i <= n/2; i++) {
			if(n%i==0) {
				return true;
			}
		}
		return false;
	}
}
