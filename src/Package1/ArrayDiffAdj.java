package Package1;

public class ArrayDiffAdj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//maximum difference between any adjacent index in an array
		int[] a = {1,2,10,4,25};
		int diff = 0;
		for(int i = 0; i<a.length-1; i++) {
			if(a[i+1] - a[i] > diff) {
				diff = a[i+1] - a[i];
			}
		}
		System.out.print(diff);
	}

}
