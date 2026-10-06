//check if the array is sorted
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int [] a= new int[n];
		System.out.println("Enter the values of the array : ");
		for(int i = 0; i<n;i++){
			a[i] = sc.nextInt();
		}
		boolean isSorted = true;
		for(int i =0;i<n-1;i++){
		if(a[i]>a[i+1]){
			isSorted = false;
			break;
		}
		}
		if(isSorted)
		System.out.println("The array is sorted : ");
		else
		System.out.println("The array is not sorted : ");	
	}

	}
