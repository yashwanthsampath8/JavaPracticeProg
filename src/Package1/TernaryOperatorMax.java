package Package1;

public class TernaryOperatorMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 20, z = 30;
		//in first bracket it will check x is greater than y, if x is greater 
		//then i will check for x is greater than z, in this x will be assigned if condition is true if not z will be assigned
		//if y is greater then it will check for y is greater than z accordingly z or y will be assigned
		int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println(largestNumber);
	}

}
