import java.util.Scanner;
public class Ha5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr [][]=new int [4][4];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=(int)(Math.random()*2);
			}
		}
		System.out.println("The 4*4 Matrix is :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("The largest row index: "+largestrow(arr));
		System.out.println("The largest column index: "+largecolumn(arr));
	}
	public static int largestrow(int a[][]) {
		int max=0;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=0;j<a.length;j++) {
				if(a[i][j]==1)
					c++;
			}
				if(c>temp) {
					temp=c;
					max=i;
				}	
		}
		return max;
	}
	public static int largecolumn(int a[][]) {
		int max=0;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=0;j<a.length;j++) {
				if(a[j][i]==1)
					c++;
			}
			if(c>temp) {
				temp=c;
				max=i;
			}
		}
		return max;
	}
}
