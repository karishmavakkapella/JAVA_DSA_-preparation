//Right rotate array by one
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
	int t = a[n-1];
	for(int i = n-2;i>=0;i--){
			a[i+1] = a[i];
	} 
	a[0] = t;
			for(int i = 0;i<n;i++){
				System.out.print(a[i]+" ");
				}	
	}
}