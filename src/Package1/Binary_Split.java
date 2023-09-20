package Package1;

public class Binary_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,1,1,0,1,1,0,0};
		int[] zero = new int[10];
		int[] one = new int[10];
		int k = 0, j= 0;
		//Segregating zero's into an array
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == 0) {
				zero[k] = arr[i];
				k++;
			}	
		}		
		//Segregating one's into an array
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == 1) {
				one[j] = arr[i];
				j++;
			}
		}
		//combining both arrays into result array using in-built function
		int[] result = new int[j+k];
		System.arraycopy(zero, 0, result, 0, k);
		System.arraycopy(one, 0, result, k, j);
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
