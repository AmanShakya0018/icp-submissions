
import java.util.*;

// Question: https://leetcode.com/problems/minimum-string-length-after-removing-substrings/description/
//lc -2696
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(minLength(s));
    }

    public static int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (st.isEmpty()) {
                st.push(c);
            } else if ((st.peek() == 'A' && c == 'B') || (st.peek() == 'C' && c == 'D')) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        return st.size();
    }

    // public static int minLength(String s) {
    //     StringBuilder a = new StringBuilder(s);
    //     boolean flag = true;
    //     while(true){
    //         flag = true;
    //         for(int i = 0; i < a.length(); i++){
    //             if(a.substring(i).startsWith("AB") || a.substring(i).startsWith("CD")){
    //                 flag = false;
    //                 a.delete(i, i+2);
    //                 // System.out.println(a);
    //                 break;
    //             }
    //         }
    //         if(flag){
    //             break;
    //         }
    //     }
    //     // System.out.println(a);
    //     return a.length();
    // }
}
