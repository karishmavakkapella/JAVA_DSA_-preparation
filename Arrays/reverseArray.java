//reversing array without using second array
import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("Enter the size of the array : ");
	int n = sc.nextInt();
	int[] a = new int[n];
	System.out.println("Enter the values of array : ");
	for(int i= 0;i<n;i++){
		a[i] = sc.nextInt();
	}
	int mid = n/2;
	for(int i=0;i<mid;i++){
		int t = a[i];
	a[i] = a[(n-1)-i];
	a[(n-1)-i]=t;
		}
	for(int i =0;i<n;i++){
		System.out.print(a[i]+" ");
	}
	}
}