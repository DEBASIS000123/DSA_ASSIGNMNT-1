import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double arr[][]=new double [3][4];
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextDouble();
			}
		}
		for(int k=0;k<4;k++) {
			System.out.println("Sum of the elements at column "+k+" is "+sumColumn(arr,k));
		}
	}
	public static double sumColumn(double[][]a, int columnIndex) {
		double sum=0;
		for(int i=0;i<3;i++)	{
			for(int j=0;j<4;j++) {
				if(j==columnIndex)
				sum+=a[i][j];
				
			}
			
		}
		return sum;
	
	}
	
}