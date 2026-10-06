//duck number
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
boolean isduck= false;
if(n==0){
System.out.println("not a duck number");
return;
}
while(n>0){
int digit = n%10;
if(digit==0){
isduck = true;
break;
}
n= n/10;
}
if(isduck==true){
System.out.println("duck number");
}else{
System.out.println("not a duck number");
}
}
}