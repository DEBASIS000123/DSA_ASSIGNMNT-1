import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int t=n;
		int mul=1,add=0;
		while(n!=0) {
			int r=n%10;
			mul*=r;
			add+=r;
			n=n/10;
		}
		if(mul==add)
			System.out.println(t+" is a spy number.");
		else
			System.out.println(t+" is not spy number.");
	}

}
