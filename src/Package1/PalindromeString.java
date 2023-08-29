package Package1;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		String t = "";
		for(int i = s.length()-1; i>=0;i--) {
			t = t + s.charAt(i);
		}
		//System.out.print(t);
		if(s.equals(t)) {
			System.out.print("Palindrome");
		}else
		{
			System.out.print("Not Palindrome");
		}
			
	}

}
