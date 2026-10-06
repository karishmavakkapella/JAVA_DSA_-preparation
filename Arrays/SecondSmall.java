import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int [n];
		for(int i = 0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int small = Integer.MAX_VALUE; 
		int secondSmall= Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(a[i]<small){
				secondSmall = small;
				small= a[i];
			}else if(a[i]<secondSmall&&a[i]!=small){
				secondSmall = a[i];
			}
		}
			System.out.print(secondSmall);
			
	}
}