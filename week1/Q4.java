
import java.util.*;

// Question Number: 204
// Question: https://leetcode.com/problems/count-primes/description/
public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        boolean[] arr = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        int count = 0;
        for (int p = 2; p <= n; p++) {
            if (arr[p]) {
                count++;
            }
        }
        return count;
    }
}
