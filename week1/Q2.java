
import java.util.*;

// Question Number: 28
// Question: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.next("Enter the haystack: ");
        String needle = sc.next("Enter the needle: ");
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int k = needle.length();
        if (n < k) {
            return -1;
        }
        for (int i = 0; i <= n - k; i++) {
            if (haystack.substring(i, i + k).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static int strStr1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
