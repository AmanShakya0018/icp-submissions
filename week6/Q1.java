
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        TreeNode temp = root;
        return remove(temp, target);
    }

    public TreeNode remove(TreeNode head, int target) {
        if (head == null) {
            return head;
        }
        head.left = remove(head.left, target);
        head.right = remove(head.right, target);

        if (head.left == null && head.right == null && head.val == target) {
            return null;
        }
        return head;
    }
}
