package Package1;

public class GenPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generating prime numbers till N
		
		int n = 10, count;
		for(int i = 2 ; i <=n; i++) {
			for(int j = 2; j<i;j++) {
				count = 0;
				if(i%j==0) {
					 count++;
		             break;
				}
			}
	        if(count==0)
	            System.out.println(i);
		}
	}

}
