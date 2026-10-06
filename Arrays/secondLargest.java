import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int [n];
		for(int i = 0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int large = Integer.MIN_VALUE; 
		int secondLarge = Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(a[i]>large){
				secondLarge = large;
				large = a[i];
			}else if(a[i]>secondLarge&&a[i]!=large){
				secondLarge = a[i];
			}
		}
			System.out.print(secondLarge);
			
	}
}