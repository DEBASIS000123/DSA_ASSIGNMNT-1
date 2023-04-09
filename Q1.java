import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number grater than 2 :");
		int n=sc.nextInt();
		int c=0;
		while(n>2) {
			n=n/2;
			c++;
		}
		System.out.println("The number of times one must repeatedly divide this number by 2 ,before getting a value less than 2 is "+c);
	}

}
