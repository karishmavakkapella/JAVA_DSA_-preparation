//merge two arrays
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array1  : ");
		int n1 = sc.nextInt();
			System.out.println("Enter the size of the array2 : ");
			int n2 = sc.nextInt();
			int[] a3 = new int[n1+n2];	
	int[] a2 = new int[n2];
		int[] a1 = new int[n1];
		System.out.println("Enter the values of array1 : ");
		for(int i=0;i<n1;i++){
	a1[i] = sc.nextInt();
		a3[i] = a1[i];
	}
	System.out.println("Enter the values of array2 :");	for(int i = 0;i<n2;i++){
		a2[i] = sc.nextInt();
		a3[n1+i] = a2[i];
	}
	for(int i =0;i<n1+n2;i++){
	System.out.print(a3[i]+" ");
	}	
	}
}