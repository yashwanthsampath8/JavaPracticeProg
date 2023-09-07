package Package1;

public class CountStringOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int occ = countOccurance("yashawa",'a');
		System.out.print(occ);
	}

	private static int countOccurance(String s1, char s2) {
		// TODO Auto-generated method stub
		int k=0;
		for(int i = s1.length()-1; i>=0; i--) {	
			if(s2 == s1.charAt(i)) {
				k++;
			}
		}
		return k;
	}

}
