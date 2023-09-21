package Package_OOPS;

//demonstration of single inheritance
public class Employee {
	int salary = 4000;
	
}
	class Programmer extends Employee{
	int bonus = 1000;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer();
		System.out.println("Base Salary "+p.salary);
		System.out.println("Bonus "+p.bonus);
	}

}
