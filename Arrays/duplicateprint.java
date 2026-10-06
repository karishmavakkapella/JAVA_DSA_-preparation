//print duplicate elements
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            // Check if this element appeared before
            boolean seenBefore = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    seenBefore = true;
                    break;
                }
            }

            if (seenBefore) {
                continue;
            }

            // Check if it appears again later
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}