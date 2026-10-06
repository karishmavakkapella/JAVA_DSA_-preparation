//Missing number
import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array : ");
	int n = sc.nextInt();
		int originalSum =(n*(n+1))/2;
		int arraySum = 0;
	for(int i = 0;i<n-1;i++){
		int num = sc.nextInt();
		arraySum +=num;
		}
		int element = originalSum-arraySum;
		System.out.println("Missing element is : "+element);
	}
}