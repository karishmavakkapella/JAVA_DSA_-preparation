
//Sum of digits = product of digits
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum=0;
int product = 1;
if(n<=0){
System.out.println("not a SPY number");
return;
}
while(n>0){
int digit = n%10;
sum = sum+digit;
product = product*digit;
n=n/10;
}
if(sum==product){
System.out.println("SPY number");
}else{
System.out.println("not a SPY number");
}
}
}