//move all zeroes to the end
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] a = new int[n];
for(int i = 0;i<n;i++){
a[i] = sc.nextInt();
}
int[] b = new int[n];
int count = 0;
for(int i = 0;i<n;i++){
if(a[i]!= 0){
b[count] = a[i];
count++;
}
}
for(int i = 0;i<n;i++){
System.out.print(b[i]+" ");
}		
}
}