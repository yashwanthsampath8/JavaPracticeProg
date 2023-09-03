package Package1;

public class CalBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = 452.00, height = 72.00;
		double bmi = CalBmi(weight, height);
		System.out.println(bmi);
	}
	public static Double CalBmi(Double weight, Double height) {
		//formula for height in inches and weight in pounds
		return 703.00*weight/(height*height);
	}

}
