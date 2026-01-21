
import java.util.*;

// Question: https://leetcode.com/problems/make-the-string-great/description/
//lc-1544
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(makeGood(s));
        // System.out.println('a' - 'A');
    }

    public static String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (st.isEmpty()) {
                st.push(c);
            } else if (Math.abs(c - st.peek()) == 32) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
