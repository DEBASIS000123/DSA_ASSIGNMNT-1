import java.util.Scanner;
public class Ha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrays :");
		int n=sc.nextInt();
		int a[]=new int [n];
		int b[]=new int[n];
		int c[]=new int [n];
		System.out.println("Enter first array elements :");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the second array elements :");
		for(int j=0;j<n;j++) {
	     	b[j]=sc.nextInt();
		}
		System.out.println("Dot product of two arrays is :");
		for(int k=0;k<n;k++) {
			c[k]=a[k]*b[k];
			System.out.print(c[k]+"  ");
		}
	}

}
