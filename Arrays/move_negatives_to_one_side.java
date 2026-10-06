//move all negative numbers to one side
//swapping
import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array : ");
	int n = sc.nextInt();
	int count = 0;
	int[] a = new int[n];
	System.out.println("Enter the values of the array : ");
	for(int i = 0;i<n;i++){
		a[i] = sc.nextInt();
		if(a[i]<0){
			count++;
		}
	}
			for(int i = 1;i<=count;i++){
				for(int j =0;j<n-1;j++){
					if(a[j+1]<0&&a[j]>=0){
						int t = a[j];
						a[j] = a[j+1];
						a[j+1] = t;
					}
				}
			}
				for(int i =0;i<n;i++){
					System.out.print(a[i]+" ");
				}
	}
}