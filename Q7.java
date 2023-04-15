import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		maxmin(arr);
	}
	public static void maxmin(int a[]) {
		int max=a[0];
		int min=a[0];
		int c1=0,c2=0;
		int pos1=0,pos2=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==max)
				c1++;
			if(a[i]==min) {
				c2++;
				pos2=i;
			}
		}
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]==max)
				pos1=i;
		}
		System.out.println("Maximum element of Array is "+max+" and occurs "+c1+" times.");
		System.out.println("Minimum element of Array is "+min+" and occurs "+c2+" times.");
		System.out.println("First occurrence of maximum element is at position "+(pos1+1)+".");
		System.out.println("Last occurrence of mainimum element is at position "+(pos2+1)+".");
	}

}
