import java.util.Scanner;
public class Ha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first integer :");
		int a=sc.nextInt();
		System.out.println("Enter the second integer :");
		int b=sc.nextInt();
		System.out.println("Enter the third integer :");
		int c=sc.nextInt();
		if(a+b==c || b-c==a || a*b==c) {
			System.out.println("The numbers can be used in a correct ariyhmetic formula.");
		}
		else
			System.out.println("The numbers cannot be used arithmetic formula.");
	}

}
