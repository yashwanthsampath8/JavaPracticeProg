package Package_OOPS;

interface AA{
	public void printA();
}

interface BB{
	public void printB();
}

interface CC extends AA, BB{
	public void printC();
}

class child implements CC{

	@Override
	public void printA() {
		// TODO Auto-generated method stub
		System.out.println("A");
	}

	@Override
	public void printB() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}

	@Override
	public void printC() {
		// TODO Auto-generated method stub
		System.out.println("C");
	}
	
}
//demonstrating multiple inheritance using interface
public class InMain{

	public static void main(String[] args) {
		child c1 = new child();
		c1.printA();
		c1.printB();
		c1.printC();
	}
}
