//left rotate array by k position
import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array : ");int n = sc.nextInt();
	int[] a = new int[n];
	System.out.println("Enter the values of the array : ");
	for(int i = 0;i<n;i++){
		a[i] = sc.nextInt();
		}
		System.out.println("Enter the value of k");
		int k = sc.nextInt();
		k = k%n;
		for(int i = 1;i<=k;i++){
	int t = a[0];
	for(int j = 0;j<n-1;j++){
			a[j] = a[j+1];
	} 
	a[n-1] = t;
		}
			for(int i = 0;i<n;i++){
				System.out.print(a[i]+" ");
				}	
	}
}