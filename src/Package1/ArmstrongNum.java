package Package1;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 371, orinum, rem, result = 0;
		orinum = num;
		while(orinum != 0) //checking numb is not zero
		{
			rem = orinum % 10; //
			result += Math.pow(rem, 3);
			orinum/=10;
		}
		if(result == num) {
			System.out.print("Armstrong number");
		}else
		{
			System.out.print("Not Armstrong number");
		}
	}

}
