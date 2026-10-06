//maximum difference
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
	int n = sc.nextInt();
	int[] a = new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int small = a[0];
		int large = a[0];
		for(int i = 0;i<n;i++){
			if(a[i]>large ){
				large = a[i];
			}
			if(a[i]<small){
				small = a[i];
			}
		}
			int dif = large-small;
			System.out.println(dif);
	}
}
