
import java.util.*;

// Question Number: 41
// Question: https://leetcode.com/problems/first-missing-positive/description/
public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int min = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            if (nums[i] == min) {
                min++;
            }
        }
        return min;
    }

    //Memory error
    // public static int firstMissingPositive(int[] nums) {
    //     int max = Integer.MIN_VALUE;
    //     for (int i : nums) {
    //         if (i > 0) {
    //             max = Math.max(i, max);
    //         }
    //     }
    //     if (max < 0) {
    //         return 1;
    //     }
    //     boolean[] dp = new boolean[max+1];
    //     for(int i: nums){
    //         dp[i] = true;
    //     }
    //     for(int i = 1; i < dp.length; i++){
    //         if(!dp[i]){
    //             return i;
    //         }
    //     }
    //     return max+1;
    // }
}
