//number pyramid
import java.util.*;
public class Main {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=1;i<=n;i++){
	//space
	for(int j=n;j>=i;j--){
		System.out.print(" ");
				}
				//first half
				for(int j = 1;j<=i;j++){
					System.out.print(j);
				}
				//second half
				for(int j=i-1;j>=1;j--){
					System.out.print(j);
				}
				System.out.println();
				}		
	}
}