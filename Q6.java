import java.util.Scanner;
public class Q6 {
	public static boolean isOdd(int n) {
		if((n & 1)==1)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		if(isOdd(n)) {
			System.out.println(n+" is odd :True");
		}
		else {
			System.out.println(n+" id odd :False");
		}
	}

}
