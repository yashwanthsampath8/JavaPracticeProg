package Package1;
import java.util.Scanner;

public class FloatIntChk {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
		
		        // patterns
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the string to check :");
		        String string = sc.nextLine();
		        //int check = 0;
		        if (string.matches("[0-9]+")) {
		        	System.out.println("its an integer");
		        } else {
		            try {
		                float floatcheck = Float.valueOf(string);
		                //check = 2;
		                System.out.println("its an float");
		            } catch (NumberFormatException N) {
		                System.out.print("its not an float number neither an integer ,please");
		            }
		        }

		    }
}
