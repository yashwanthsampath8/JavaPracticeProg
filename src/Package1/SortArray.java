package Package1;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,5,4,3,6,1,2,3,9,7,8};
		int temp;
		for(int i = 0; i<a.length;i++) { //iterating through array
			for(int j = i+1;j<a.length;j++) { //iterating for next element in the array
				temp = 0;
				if(a[i]>a[j]) {//checking if the 1st element is greater than the next element
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;//swapping the the values using temp variable
				}
			}
			System.out.println(a[i]);
		}	
}
}
