package Package_OOPS;
//Hierarchical Inheritance 
class A{
	public void printa() {
		System.out.println("A");
	}
}
class B extends A{
	public void printb() {
		System.out.println("B");
	}
}
class C extends A{
	public void printc() {
		System.out.println("C");
	}
}
class D extends A{
	public void printd() {
		System.out.println("D");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.printb();
		b1.printa();
		C c1 = new C();
		c1.printc();
		c1.printa();
		D d1 = new D();
		d1.printd();
		d1.printa();
	}

}
