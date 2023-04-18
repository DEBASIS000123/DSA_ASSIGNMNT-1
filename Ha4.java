import java.util.Scanner;
public class Ha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows and columns :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		double arr1[][]=new double [a][b];
		double arr2[][]=new double[a][b];
		double z[][]=new double[a][b];
		System.out.println("Enter the first array elements :");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=sc.nextDouble();
			}
		}
		System.out.println("Enter the second array elements :");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j]=sc.nextDouble();
					
			}
		}
		z=addMatrix(arr1,arr2);
		for(int i=0;i<z.length;i++) {
			for(int j=0;j<z[i].length;j++) {
				System.out.print(z[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
	public static double[][] addMatrix(double[][] a, double[][] b){
		double sum[][]=new double[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			 sum[i][j]=a[i][j]+b[i][j];
			}
		}
		return sum;
	}
}
