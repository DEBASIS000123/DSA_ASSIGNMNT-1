import java.util.Scanner;
public class Q4{
	public static void main(String args[]){
		// TODO Auto-generated method stub
		char arr[]= {'c','a','r','b','o','n'};
		for(int j=0;j<6;j++) {
			for(int k=0;k<6;k++) {
				for(int l=0;l<6;l++) {
					for(int m=0;m<6;m++) {
						for(int n=0;n<6;n++) {
							for(int o=0;o<6;o++) {
								if(j!=k && j!=l && j!=m && j!=n &&j!=o
								&& k!=l && k!=m && k!=n && k!=o
							    && l!=m && l!=n && l!=o
							    && m!=n && m!=o 
							    &&  n!=0)
									System.out.println(" "+arr[j]+arr[k]+arr[l]+arr[m]+arr[n]+arr[o]);
							}
						}
					}
				}
			}
		}
	}
}