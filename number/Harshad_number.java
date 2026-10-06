//Harshad number
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int num = n;
int sum = 0;
if(n==0){
System.out.println("not a Harshad number");
return;
}
while(n>0){
int digit = n%10;
sum = sum+digit;
n = n/10;
}
if(num%sum==0){
System.out.println("Harshad number");
}else {
System.out.println("not a Harshad number");
}
}
}