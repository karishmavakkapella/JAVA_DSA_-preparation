//largest element
import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int[] a = new int[n];
	for(int i = 0;i<n;i++){
		a[i] = sc.nextInt();
	}
	int large = a[0];
	for(int i = 0;i<n;i++){
		if(a[i]>large){
			large = a[i];
		}
	}
	System.out.print(large);
	}
}