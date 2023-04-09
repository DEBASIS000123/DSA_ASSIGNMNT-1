import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your body weight in kg :");
		double w=sc.nextDouble();
		System.out.println("Enter your height in meter :");
		double h=sc.nextDouble();
		double bmi=w/(h*h);
		
		if(bmi<18.5) {
			System.out.println("This person is Underweight");
		}
		else if(bmi>=18.5 && bmi<=24.9) {
			System.out.println("This person is Normal Weight");
		}
		else if(bmi>=25 && bmi<=29.9) {
			System.out.println("This person is Overweight");
		}
		else if(bmi>=30) {
			System.out.println("This person is Obese");
		}
	}

}
