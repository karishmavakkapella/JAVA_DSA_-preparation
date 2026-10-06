//automorphic number
public class Main {
	public static void main(String[] args) {
		
	}
}
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int num=n;
int square = n*n;
int count = 0;
while(n>0){
int digit = n%10;
count++;
n=n/10;
}
int pow = (int)Math.pow(10,count);
int last = square%pow;
if(last ==num){
System.out.println("automarphic");
}else{
System.out.println("not automarphic");
}
}