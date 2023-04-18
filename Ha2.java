import java.util.Scanner;
public class Ha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines :");
		int n=sc.nextInt();
		String str[]=new String[n];
		System.out.println("Enter the lines :");
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		System.out.println("Lines are in reversed order are :");
		for(int j=n-1;j>=0;j--) {
			System.out.println(str[j]);
		}
	}

}
