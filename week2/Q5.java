
// Question: https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/description/
// lc - 1526
public class Q5 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Solution.minNumberOperations(new int[]{1, 2, 3, 2, 1}));

    }

}

class Solution {

    public static int minNumberOperations(int[] target) {
        int n = target.length;
        int count = target[0];
        for (int i = 1; i < n; i++) {
            count += Math.max(target[i] - target[i - 1], 0);
        }
        return count;
    }
}
