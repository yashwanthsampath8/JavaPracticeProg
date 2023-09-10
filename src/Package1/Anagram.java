package Package1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s1="silent";
	String s2="listen";
	char[] c1 = s1.toCharArray();
	char[] c2 = s2.toCharArray();
	boolean check = false;
	if(c1.length == c2.length)//check for length of the string
	{	
		Arrays.sort(c1);
        Arrays.sort(c2);
		for(int i = 0; i<c1.length; i++) {
			if(c1[i] == c2[i]) {
				check = true;
			}else {
				check = false;
			}
		}
		if(check) {
			System.out.println("Anagram");
		}else{		
			System.out.println("Not Anagram");
		}
	}else
	{
		System.out.println("Not Anagram");
	}

}
}
