package Package_OOPS;
//multi level inheritance demo
class One { // class 1

	public void Print_one() {
		System.out.println("One");
	}
}
class Two extends One{ //class 2 which extends class 1
	
	public void Print_two() {
		System.out.println("Two");
	}
}
class Three extends Two{ //class 3 which extends class 2
	public void Print_three() {
		System.out.println("Three");
	}
}
public class Main{
	public static void main(String args[]) {
		Three t1 = new Three();
		t1.Print_one();
		t1.Print_two();
		t1.Print_three();
	}
}