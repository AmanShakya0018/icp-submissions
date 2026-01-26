// leetcode - q3412 - https://leetcode.com/problems/sum-of-total-strength-of-wizards/description/

class Solution {

    public long calculateScore(String s) {
        int n = s.length();
        long score = 0;

        Map<Integer, Stack<Integer>> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(i, new Stack<>());
        }

        for (int i = 0; i < n; i++) {
            int chIdx = s.charAt(i) - 'a';
            int mrIdx = 25 - chIdx;  //Mirror Character INT

            if (!map.get(mrIdx).isEmpty()) {
                score += i - map.get(mrIdx).pop();
            } else {
                map.get(chIdx).push(i);
            }
        }

        return score;
    }
}
