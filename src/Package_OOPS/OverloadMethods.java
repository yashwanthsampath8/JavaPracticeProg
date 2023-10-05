package Package_OOPS;

class Adder{  
static int add(int a,int b)
{return a+b;}  
static int add(int a,int b,int c)
{return a+b+c;}  
}  
public class OverloadMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if a class has multiple methods having same name but different parameters is called method overloading
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(11,11,11));  
	}

}
