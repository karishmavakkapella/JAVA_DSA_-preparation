//diamond
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		int n = ac.nextInt();
		//pyramid
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=n-i;j++){
				System.out.print(" ");
			}
				for(int j = 1;j<=(2*i)-1;j++){
					System.out.print("*");
				}
				System.out.println();
			}
			//reverse pyramid
			for(int i = n-1;i>=1;i--){
				for(int j =1;j<=n-i;j++){
					System.out.print(" ");
				}for(int j=1;j<=(2*i)-1;j++){
					System.out.print("*");
				}
				System.out.println();
			}
	}
}