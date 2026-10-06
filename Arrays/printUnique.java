//printing of unique elements
import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	for(int i =0;i<n;i++){
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
	  boolean isseen = false;
	  for(int j=0;j<i;j++){
	  	if(a[i]==a[j]){
	  		isseen = true;
	  		break;
	  	}
	  	
		} 
		if(isseen)
		continue;
		boolean isunique = true;
		for(int j=i+1;j<n;j++){
			if(a[i]==a[j]){
			isunique = false;
			break;
			}
		}
			if(isunique){
			System.out.print(a[i]+" ");
			
			}
		}				
	}
}