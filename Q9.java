import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Double arr[][]=new Double[4][4];
		double sum=0;
		System.out.println("Enter a 4-by-4 matrix row by row:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextDouble();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					sum+=arr[i][j];
				}
			}
		}
		System.out.println("Sum of the elements in the major diagonal is :"+sum);
	}

}
