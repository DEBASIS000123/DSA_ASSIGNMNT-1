import java.util.Scanner;
public class Q5 {

			public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number :");
			int n=sc.nextInt();
			int sum=0;
			while(n!=0) {
				int r=n%10;
				sum+=r;
				n=n/10;
				if ( n==0 && sum>=10){
					n=sum;
					sum=0;
				}
			}
			System.out.println("Sum of digits of 9294 until the number is a single digit is :"+sum);
	}

}
